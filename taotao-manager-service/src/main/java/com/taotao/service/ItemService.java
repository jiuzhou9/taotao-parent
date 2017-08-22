package com.taotao.service;

import com.taotao.mapper.model.Item;

/**
 * Created by jiuzhou on 2017/8/22.
 */
public interface ItemService {
    int deleteByPrimaryKey(Long id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}
