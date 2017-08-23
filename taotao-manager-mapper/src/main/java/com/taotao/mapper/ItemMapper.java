package com.taotao.mapper;

import com.taotao.mapper.model.Item;

import java.util.List;
import java.util.Map;

public interface ItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    /**
     * 条件查询
     * @param item
     * @return
     */
    List<Item> selectByCondition(Item item);
}