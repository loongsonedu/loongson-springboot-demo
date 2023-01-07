package com.ruoyi.system.service;


import com.ruoyi.system.domain.Course;
import com.ruoyi.system.domain.HomePages;
import com.ruoyi.system.param.CourseParam;
import com.ruoyi.system.param.HotCourseParam;

import java.util.List;

public interface CourseService {
    Object getAllCourse(CourseParam param);

    Object getAllHotCourse(HotCourseParam param);

    Object addCourse(CourseParam param);

    void updateCourse(CourseParam param);

    Course getCourseAndClasss(Integer id);

    Object getCourse(CourseParam param);

}
