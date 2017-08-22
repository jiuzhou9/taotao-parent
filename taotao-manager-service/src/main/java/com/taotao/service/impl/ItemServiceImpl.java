package com.taotao.service.impl;

import com.taotao.mapper.ItemMapper;
import com.taotao.mapper.model.Item;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jiuzhou on 2017/8/22.
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    public int insert(Item record) {
        return 0;
    }

    public int insertSelective(Item record) {
        return 0;
    }

    public Item selectByPrimaryKey(Long id) {
        Item item = itemMapper.selectByPrimaryKey(id);
        return item;
    }

    public int updateByPrimaryKeySelective(Item record) {
        return 0;
    }

    public int updateByPrimaryKey(Item record) {
        return 0;
    }
}
