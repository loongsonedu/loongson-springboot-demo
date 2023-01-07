package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.HomePages;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomePagesMapper {
    List<HomePages> selectByClientId(String clientId);
}
