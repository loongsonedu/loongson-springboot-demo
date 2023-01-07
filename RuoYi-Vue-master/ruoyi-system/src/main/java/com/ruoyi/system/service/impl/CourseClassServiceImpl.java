package com.ruoyi.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.ruoyi.system.domain.CourseClass;
import com.ruoyi.system.domain.HomePages;
import com.ruoyi.system.mapper.CourseClassMapper;
import com.ruoyi.system.param.CourseClassParam;
import com.ruoyi.system.param.CourseParam;
import com.ruoyi.system.service.CourseClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseClassServiceImpl implements CourseClassService {

    @Autowired
    private CourseClassMapper courseClassMapper;

    @Override
    public Object getCourseClasses(CourseClassParam param) {

        PageHelper.startPage(param.getPage(), param.getSize());

        List<CourseClass> list = courseClassMapper.selectCourseClasses(param.getClientId(), param.getCourseId());

//        PageInfo<HomePages> pageInfo = new PageInfo<HomePages>(list);

//        PageResult result = new PageResult(pageInfo.getTotal(), pageInfo.getList());

        return list;
    }

}
