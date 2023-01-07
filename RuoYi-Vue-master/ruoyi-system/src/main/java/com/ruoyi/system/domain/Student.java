package com.ruoyi.system.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    //测试改代码
    private String clientId;

    private String courseId;

    private String classId;

    private String userId;

    private Integer jhiType;

    private String name;

    private String avatalUrl;

    private String phone;

    private String email;

    private String gender;

    private String age;

    private String location;

    private String company;

    private String tag;

    private String status;

    private Date createdAt;

    private Date updatedAt;

    private String verify;

    private Long uniCourseId;

    private String tencentUserId;

}
