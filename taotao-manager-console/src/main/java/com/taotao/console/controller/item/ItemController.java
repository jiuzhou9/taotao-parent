package com.taotao.console.controller.item;

import com.taotao.api.ItemServiceApi;
import com.taotao.common.PageDetail;
import com.taotao.common.Result;
import com.taotao.pojo.EasyUIResult;
import com.taotao.pojo.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by jiuzhou on 2017/8/22.
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemServiceApi itemServiceApi;


    @RequestMapping("/getList")
    @ResponseBody
    public EasyUIResult<ItemDto> list(Integer page,Integer rows){
        Result<PageDetail<ItemDto>> pageDetailResult = itemServiceApi.selectPage(page, rows, null);
        if (pageDetailResult.getCode().equals("0")){
            PageDetail<ItemDto> itemDtoPageDetail = pageDetailResult.getObject();
            List<ItemDto> list = itemDtoPageDetail.getList();
            long total = itemDtoPageDetail.getPageSize();
            EasyUIResult easyUIResult = new EasyUIResult(total,list);
            return easyUIResult;
        }else {
            //异常
        }
        return null;
    }
}
