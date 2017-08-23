package com.taotao.api;

import com.taotao.common.PageDetail;
import com.taotao.common.Result;
import com.taotao.pojo.ItemDto;

import java.util.List;
import java.util.Map;

/**
 * Created by jiuzhou on 2017/8/22.
 */
public interface ItemServiceApi {
    int deleteByPrimaryKey(Long id);

    int insert(ItemDto record);

    int insertSelective(ItemDto record);

    Result<ItemDto> selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemDto record);

    int updateByPrimaryKey(ItemDto record);

    /**
     * 分页条件查询
     * @param pageNum
     * @param pageSize
     * @param itemDto
     * @return
     */
    Result<PageDetail<ItemDto>> selectPage(int pageNum, int pageSize, ItemDto itemDto);

    /**
     * 集合查询
     * @return
     */
    List<ItemDto> selectAll();
}
