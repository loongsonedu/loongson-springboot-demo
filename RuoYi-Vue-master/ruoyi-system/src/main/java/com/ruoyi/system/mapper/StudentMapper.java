package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> selectStudentByClientId(@Param("clientId") String clientId,@Param("courseId") String courseId);
}
