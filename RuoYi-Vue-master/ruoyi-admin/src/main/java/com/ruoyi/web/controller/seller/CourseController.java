package com.ruoyi.web.controller.seller;

import com.ruoyi.system.domain.Course;
import com.ruoyi.system.domain.HomePages;
import com.ruoyi.system.param.*;
import com.ruoyi.system.service.*;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/seller/api")
@RestController
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private HomePagesService homePagesService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseClassService courseClassService;

    //查询所有课程
    @GetMapping("/coursesget/getAllCoursesByConditionsWithTotal")
    public Object getAllCourse(CourseParam param){
        return courseService.getAllCourse(param);
    }

//    //查询热门所有课程
//    @GetMapping("/coursesget/getAllHotCoursesByConditionsWithTotal")
//    public Object getHotCourse(HotCourseParam param){
//        return courseService.getAllHotCourse(param);
//    }

    @GetMapping("/courses")
    public Object getCourse(CourseParam param){
        return courseService.getCourse(param);
    }

    //添加课程基本信息
    @PostMapping("/courses")
    public Object addCourse(@RequestBody CourseParam param) {
        return courseService.addCourse(param);
    }

    //删除课程
    @PostMapping("/courses/update")
    public void updateCourse(@RequestBody CourseParam param){
         courseService.updateCourse(param);
    }


   //获取主页信息
    @GetMapping("/homepages")
    public Object gethomePages(HomePagesParam param){
        return homePagesService.queryhomePages(param);
    }

    //获取讲师信息
    @GetMapping("/teachers/getAllTeachersByConditionsWithTotal")
    public Object getTeachers(TeacherParam param){
        return teacherService.queryTeachers(param);
    }

    //获取学生信息
    @GetMapping("/students")
    public Object getStudents(StudentParam param){
        return studentService.getStudents(param);
    }


   //获取课程回放信息
    @GetMapping("/course-classes")
    public Object getCourseClasses(CourseClassParam param){
        return courseClassService.getCourseClasses(param);
    }
}
