package com.taotao.service.proxy;

import com.taotao.api.ItemServiceApi;
import com.taotao.common.Result;
import com.taotao.mapper.model.Item;
import com.taotao.pojo.ItemDto;
import com.taotao.service.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jiuzhou on 2017/8/22.
 */
public class ItemServiceApiProxy implements ItemServiceApi {
    @Autowired
    private ItemService itemService;
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    public int insert(ItemDto record) {
        return 0;
    }

    public int insertSelective(ItemDto record) {
        return 0;
    }

    public Result<ItemDto> selectByPrimaryKey(Long id) {
        Item item = itemService.selectByPrimaryKey(id);
        ItemDto itemDto = new ItemDto();
        BeanUtils.copyProperties(item,itemDto);
        return Result.buildSuccess(itemDto);
    }

    public int updateByPrimaryKeySelective(ItemDto record) {
        return 0;
    }

    public int updateByPrimaryKey(ItemDto record) {
        return 0;
    }
}
