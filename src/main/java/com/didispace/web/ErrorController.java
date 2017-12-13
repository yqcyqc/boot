package com.didispace.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhudonghong123 on 2017/12/13.
 */
@Controller
public class ErrorController {
    @RequestMapping("/errors")
    public String error() throws Exception {
        throw new Exception("发生错误");
    }

}
