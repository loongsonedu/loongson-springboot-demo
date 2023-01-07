package com.ruoyi.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.common.response.PageResult;
import com.ruoyi.common.response.TeacherResult;
import com.ruoyi.system.domain.Course;
import com.ruoyi.system.domain.Teacher;
import com.ruoyi.system.mapper.TeacherMapper;
import com.ruoyi.system.param.TeacherParam;
import com.ruoyi.system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Object queryTeachers(TeacherParam param) {

        PageHelper.startPage(param.getPage()+1, param.getSize());

        List<Teacher> list = teacherMapper.selectByClientId(param.getClientId());

        PageInfo<Teacher> pageInfo = new PageInfo<Teacher>(list);

        TeacherResult result = new TeacherResult(pageInfo.getTotal(), pageInfo.getList());

        return result;
    }
}
