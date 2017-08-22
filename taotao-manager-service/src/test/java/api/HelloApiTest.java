package api;

import com.alibaba.fastjson.JSON;
import com.caucho.hessian.client.HessianProxyFactory;
import com.taotao.api.HelloApi;
import com.taotao.common.Result;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jiuzhou on 2017/8/22.
 */
public class HelloApiTest {
    public static HelloApi api;
    @Before
    public void setUp() throws Exception {
        api= (HelloApi) new HessianProxyFactory().create(HelloApi.class,"http://localhost:8080/taotao-manager-service/api/helloApi");
    }

    @Test
    public void helloTest(){
        api.hello();
    }

    @Test
    public void getResult(){
        Result<String> zhangsan = api.getResult("zhangsan");
        System.out.println(JSON.toJSONString(zhangsan));
    }
}
