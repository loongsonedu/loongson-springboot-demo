package com.ruoyi.system.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String clientId;

    private String teacherId;

    private String jhiType;

    private String name;

    private String avatarUrl;

    private String phone;

    private String email;

    private String gender;

    private String age;

    private String location;

    private String company;

    private String jhiRole;

    private String coursesCount;

    private String studentsCount;

    private String info;

    private String tag;

    private String createdAt;

    private String updatedAt;
}
