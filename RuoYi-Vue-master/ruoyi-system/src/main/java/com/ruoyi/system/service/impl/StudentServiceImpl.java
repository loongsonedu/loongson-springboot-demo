package com.ruoyi.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.common.response.PageResult;
import com.ruoyi.system.domain.Course;
import com.ruoyi.system.domain.Student;
import com.ruoyi.system.mapper.StudentMapper;
import com.ruoyi.system.param.StudentParam;
import com.ruoyi.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Object getStudents(StudentParam param) {

        PageHelper.startPage(param.getPage()+1, param.getSize());

        List<Student> list = studentMapper.selectStudentByClientId(param.getClientId(),param.getCourseId());

//        PageInfo<Student> pageInfo = new PageInfo<Student>(list);

//        PageResult result = new PageResult(pageInfo.getTotal(), pageInfo.getList());

        return list;
    }
}
