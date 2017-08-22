package com.taotao.service.proxy;

import com.taotao.api.HelloApi;
import com.taotao.common.Result;

/**
 * Created by jiuzhou on 2017/8/22.
 */
public class HelloApiProxy implements HelloApi {
    public void hello() {
        System.out.println("hello");
    }

    public Result<String> getResult(String name) {
        Result<String> stringResult = Result.buildSuccess("hello " + name);
        return stringResult;
    }
}
