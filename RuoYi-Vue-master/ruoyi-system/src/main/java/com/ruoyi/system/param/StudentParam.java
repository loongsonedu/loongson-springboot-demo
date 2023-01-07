package com.ruoyi.system.param;

import lombok.Data;

import java.util.Date;

@Data
public class StudentParam extends BasePageParam{

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

    private int page;

    private int size;
}
