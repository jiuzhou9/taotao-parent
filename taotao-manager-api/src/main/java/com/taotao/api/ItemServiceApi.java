package com.taotao.api;

import com.taotao.common.Result;
import com.taotao.pojo.ItemDto;

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
}
