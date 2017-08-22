package api;

import com.alibaba.fastjson.JSON;
import com.caucho.hessian.client.HessianProxyFactory;
import com.taotao.api.HelloApi;
import com.taotao.api.ItemServiceApi;
import com.taotao.common.Result;
import com.taotao.pojo.ItemDto;
import com.taotao.service.ItemService;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jiuzhou on 2017/8/22.
 */
public class ItemServiceApiTest {
    public static ItemServiceApi api;
    @Before
    public void setUp() throws Exception {
        String url = "http://localhost:8080/taotao-manager-service/api/itemServiceApi";
        api= (ItemServiceApi) new HessianProxyFactory().create(ItemServiceApi.class,url);
    }


    @Test
    public void getResult(){
        Result<ItemDto> result = api.selectByPrimaryKey(536563l);
        System.out.println(JSON.toJSONString(result));
    }
}
