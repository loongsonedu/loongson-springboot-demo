package com.ruoyi.system.param;

import com.ruoyi.system.domain.Course;
import com.ruoyi.system.domain.CourseClass;
import lombok.Data;

import java.util.List;

@Data
public class CourseParam extends BasePageParam{
    private Long id;

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

    private Integer createdAt;

    private String updatedAt;

    private Byte isDelete;

    private Integer courseIndex;

    private String oldPrice;

    private Integer ishd;

    private String status;

    private String summary;

    private Byte showqr;

    private String linkUrl;

    private Integer gradeLevel;

    private int page;

    private int size;

    private List<CourseClass> classList;
}
