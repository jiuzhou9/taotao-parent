package com.taotao.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jiuzhou on 2017/8/23.
 */
@Controller
@RequestMapping("/")
public class ToPage {
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String toPage(@PathVariable String page){
        return page;
    }
}
