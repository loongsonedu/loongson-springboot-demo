package com.ruoyi.system.param;

import com.ruoyi.system.domain.CourseClass;
import lombok.Data;

import java.util.List;

@Data
public class HotCourseParam extends BasePageParam{
    private Long id;
    private String clientId;
    private String tag;
}
