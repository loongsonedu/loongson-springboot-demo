package com.ruoyi.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class  PageResult<T> {

    private long totalNum;

    private List<T> courseList;
}
