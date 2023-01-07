package com.ruoyi.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.common.response.PageResult;
import com.ruoyi.system.domain.Course;
import com.ruoyi.system.domain.HomePages;
import com.ruoyi.system.mapper.HomePagesMapper;
import com.ruoyi.system.param.HomePagesParam;
import com.ruoyi.system.service.HomePagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomePagesServiceImpl implements HomePagesService {

    @Autowired
    private HomePagesMapper homePagesMapper;


    @Override
    public Object queryhomePages(HomePagesParam param) {

//        PageHelper.startPage(param.getPage()+1, param.getSize());

        List<HomePages> list = homePagesMapper.selectByClientId(param.getClientId());

//        PageInfo<HomePages> pageInfo = new PageInfo<HomePages>(list);

//        PageResult result = new PageResult(pageInfo.getTotal(), pageInfo.getList());

        return list;
    }
}
