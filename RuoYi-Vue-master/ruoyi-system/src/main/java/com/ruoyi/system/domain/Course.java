package com.ruoyi.system.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Course implements Serializable {

    private Long id;

    //测试改代码
    private String clientId;

    private String courseId;

    private String roomId;

    private String title;

    private String typeId;

    private Integer isSpecail;

    private Integer jhiType;

    private String coverUrl;

    private String teacher;

    private String startAt;

    private String location;

    private String buyersCount;

    private String price;

    private String tag;

    private Integer totalNum;

    private Date createdAt;

    private Date updatedAt;

    private Integer isDelete;

    private Integer courseIndex;

    private String oldPrice;

    private Integer ishd;

    private String status;

    private String summary;

    private Byte showqr;

    private String linkUrl;

    private Integer gradeLevel;

    private String info;

    private String introduction;

    private List<CourseClass> courseClasss;

}