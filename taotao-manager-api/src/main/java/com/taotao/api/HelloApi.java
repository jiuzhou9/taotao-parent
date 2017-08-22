package com.taotao.api;

import com.taotao.common.Result;

/**
 * Created by jiuzhou on 2017/8/22.
 */
public interface HelloApi {
    public void hello();
    public Result<String> getResult(String name);
}
