package com.lsx.tyre.service.impl;

import com.lsx.base.vo.BaseVo;
import com.lsx.tyre.bean.Dict;
import com.lsx.tyre.dao.DictMapper;
import com.lsx.tyre.service.DictService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * @author jack
 * @desc 字典项接口实现
 * @date 2020/03/30
 */
@Service("dictService")
public class DictServiceImpl implements DictService {

    @Resource
    private DictMapper dictMapper;

    /**
     * 新增
     *
     * @param toAdd
     */
    @Override
    public void add(Dict toAdd) {
        dictMapper.insert(toAdd);
    }

    /**
     * 查询字典
     *
     * @param type
     * @return
     */
    @Override
    public BaseVo findByType(Integer type) {
        return new BaseVo(dictMapper.selectByType(type));
    }
}
