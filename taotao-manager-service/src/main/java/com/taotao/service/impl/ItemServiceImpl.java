package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.ItemMapper;
import com.taotao.mapper.model.Item;
import com.taotao.pojo.ItemDto;
import com.taotao.service.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public Item selectByPrimaryKey(Long id) throws Exception{
        if (id.equals(0)){
            throw new Exception("id不能为空");
        }
        Item item = itemMapper.selectByPrimaryKey(id);
        return item;
    }

    public int updateByPrimaryKeySelective(Item record) {
        return 0;
    }

    public int updateByPrimaryKey(Item record) {
        return 0;
    }

    public PageInfo<Item> selectPage(int pageNum, int pageSize,  Item item) {
        if (pageNum == 0){
            pageNum = 1;
        }
        if (pageSize == 0){
            pageSize = 1;
        }

        //使用pageHelper实现分页查询
        PageHelper.startPage(pageNum,pageSize);
        List<Item> items = itemMapper.selectByCondition(item);
        PageInfo<Item> pageInfo = new PageInfo(items);
        return pageInfo;
    }

    public List<Item> selectAll() {
//        List<Item> items = itemMapper.selectByCondition();
        return null;
    }
}
