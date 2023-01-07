package com.ruoyi.system.param;

import lombok.Data;

@Data
public class CourseClassParam extends BasePageParam {

    private String clientId;

    private String courseId;

    private int page;

    private int size;
}
