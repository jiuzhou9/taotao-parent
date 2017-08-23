package com.taotao.service;

import com.github.pagehelper.PageInfo;
import com.taotao.mapper.model.Item;
import com.taotao.pojo.ItemDto;

import java.util.List;
import java.util.Map;

/**
 * Created by jiuzhou on 2017/8/22.
 */
public interface ItemService {
    int deleteByPrimaryKey(Long id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Long id)throws Exception;

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @param item
     * @return
     */
    PageInfo<Item> selectPage(int pageNum, int pageSize, Item item);

    /**
     * 集合查询
     * @return
     */
    List<Item> selectAll();
}
