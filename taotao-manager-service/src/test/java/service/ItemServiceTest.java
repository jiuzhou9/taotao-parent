package service;

import com.alibaba.fastjson.JSON;
import com.taotao.mapper.model.Item;
import com.taotao.service.ItemService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jiuzhou on 2017/8/22.
 */
public class ItemServiceTest extends SpringTestCase{
    @Autowired
    private ItemService itemService;
    @Test
    public void test(){
        Item item = itemService.selectByPrimaryKey(536563l);
        System.out.println(JSON.toJSONString(item));
    }
}
