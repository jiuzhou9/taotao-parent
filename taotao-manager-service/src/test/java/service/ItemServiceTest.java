package service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
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
    public void selectPageTest(){
        Item item = new Item();
        item.setId(536563L);
        PageInfo<Item> itemPageInfo = itemService.selectPage(1, 10,item);
        System.out.println(JSON.toJSONString(itemPageInfo));
    }

    @Test
    public void selectByPrimaryKeyTest(){
        Item item = null;
        try {
            item = itemService.selectByPrimaryKey(536563l);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(JSON.toJSONString(item));
    }
}
