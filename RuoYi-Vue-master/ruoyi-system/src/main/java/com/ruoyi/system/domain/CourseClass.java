package com.ruoyi.system.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseClass implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String clientId;

    private String courseId;

    private Integer jhiType;

    private String className;

    private String coverUrl;

    private String teacher;

    private String assistant;

    private String startAt;

    private String endAt;

    private String location;

    private String classInfo;

    private String enrollCount;

    private String buyersCount;

    private String viewCount;

    private Integer price;

    private Integer jhiNumber;

    private String tag;

    private String courseClassUrl;

    private String status;

    private String createdAt;

    private String updatedAt;

    private String roomId;

    private String remark;

    private String reviewUrl;

    private String choseUrl;

}