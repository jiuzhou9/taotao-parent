package com.taotao.service.proxy;

import com.github.pagehelper.PageInfo;
import com.taotao.api.ItemServiceApi;
import com.taotao.common.PageDetail;
import com.taotao.common.Result;
import com.taotao.mapper.model.Item;
import com.taotao.mapper.model.ItemDesc;
import com.taotao.pojo.ItemDto;
import com.taotao.service.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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
        Item item = null;
        try {
            item = itemService.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public Result<PageDetail<ItemDto>> selectPage(int pageNum, int pageSize, ItemDto itemDto) {
        Item item = new Item();
        BeanUtils.copyProperties(itemDto,item);
        PageInfo<Item> itemPageInfo = itemService.selectPage(pageNum, pageSize,item);

        PageDetail<ItemDto> itemDtoPageDetail = new PageDetail();
        itemDtoPageDetail = build(itemPageInfo,itemDtoPageDetail);

        Result<PageDetail<ItemDto>> pageDetailResult = Result.buildSuccess(itemDtoPageDetail);
        return pageDetailResult;
    }

    private PageDetail<ItemDto> build(PageInfo<Item> itemPageInfo, PageDetail<ItemDto> itemDtoPageDetail) {
        BeanUtils.copyProperties(itemPageInfo,itemDtoPageDetail,"list");

        List<Item> list = itemPageInfo.getList();
        List<ItemDto> itemDtos = new ArrayList<ItemDto>();
        ItemDto itemDto = null;
        for (Item item:list){
            itemDto = new ItemDto();
            BeanUtils.copyProperties(item, itemDto);
            itemDtos.add(itemDto);
        }
        itemDtoPageDetail.setList(itemDtos);
        return itemDtoPageDetail;
    }

    public List<ItemDto> selectAll() {
        return null;
    }
}
