package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Course;
import com.ruoyi.system.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {
    List<Teacher> selectByClientId(String clientId);
}
