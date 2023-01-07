package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CourseMapper {

//    int deleteByPrimaryKey(Long id);
    int insertSelective(Course record);
    List<Course> selectByClientIdAndTag(@Param("clientId") String clientId,@Param("tag") String tag);

    List<Course> selectByClientId(String clientId);

    int updateByPrimaryKeySelective(Course record);

    Course getCourseAndClasss(Integer id);

//    Object getCourse(CourseParam param);

    List<Course> selectCourseByClientId(@Param("clientId") String clientId, @Param("courseId") String courseId);
}