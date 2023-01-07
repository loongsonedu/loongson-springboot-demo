package com.ruoyi.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.common.response.PageResult;
import com.ruoyi.system.domain.Course;
import com.ruoyi.system.domain.CourseClass;
import com.ruoyi.system.domain.HomePages;
import com.ruoyi.system.mapper.CourseClassMapper;
import com.ruoyi.system.mapper.CourseMapper;
import com.ruoyi.system.param.CourseParam;
import com.ruoyi.system.param.HotCourseParam;
import com.ruoyi.system.service.CourseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseClassMapper courseClassMapper;


    //根据热度获取课程列表
    @Override
    public Object getAllHotCourse(HotCourseParam param) {

        PageHelper.startPage(param.getPage()+1, param.getSize());

        List<Course> list = courseMapper.selectByClientIdAndTag(param.getClientId(), param.getTag());

        PageInfo<Course> pageInfo = new PageInfo<Course>(list);

        PageResult result = new PageResult(pageInfo.getTotal(), pageInfo.getList());

        return result;
    }

    //获取课程列表
    @Override
    public Object getAllCourse(CourseParam param) {

        PageHelper.startPage(param.getPage()+1, param.getSize());

        List<Course> list = courseMapper.selectByClientId(param.getClientId());

        PageInfo<Course> pageInfo = new PageInfo<Course>(list);

        PageResult result = new PageResult(pageInfo.getTotal(), pageInfo.getList());

        return result;
    }

    @Override
    public Object addCourse(CourseParam param) {
        Course c = addNewCourse(param);
        return c;
    }

    @Override
    public void updateCourse(CourseParam param) {
        Course record = new Course();
        record.setId(param.getId());
        record.setUpdatedAt(new Date());
        record.setIsDelete(0);
        int i = courseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Course getCourseAndClasss(Integer id) {
        return courseMapper.getCourseAndClasss(id);
    }


    @Override
    public Object getCourse(CourseParam param) {
        List<Course> list = courseMapper.selectCourseByClientId(param.getClientId(), param.getCourseId());
        return list;
    }


    private Course addNewCourse(CourseParam param) {
        Date date = new Date();
        Course record = new Course();
        BeanUtils.copyProperties(param,record);
        record.setCreatedAt(date);
        record.setUpdatedAt(date);
        courseMapper.insertSelective(record);
        return record;
    }


}
