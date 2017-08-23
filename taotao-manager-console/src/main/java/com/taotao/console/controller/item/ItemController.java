package com.taotao.console.controller.item;

import com.taotao.api.ItemServiceApi;
import com.taotao.common.Result;
import com.taotao.pojo.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jiuzhou on 2017/8/22.
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemServiceApi itemServiceApi;


}
