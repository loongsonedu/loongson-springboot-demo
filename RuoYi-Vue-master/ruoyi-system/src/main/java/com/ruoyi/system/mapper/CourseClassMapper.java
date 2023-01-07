package com.ruoyi.system.mapper;


import com.ruoyi.system.domain.CourseClass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CourseClassMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CourseClass record);

    int insertSelective(CourseClass record);
    int updateByPrimaryKeySelective(CourseClass record);

    int updateByPrimaryKey(CourseClass record);

    List<CourseClass> selectCourseClasses(@Param("clientId") String clientId,@Param("courseId") String courseId);

    List<CourseClass> selectCourseClassesByClientId(@Param("clientId") String clientId,@Param("courseId") String courseId);
}