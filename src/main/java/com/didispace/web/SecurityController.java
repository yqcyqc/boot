package com.didispace.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhudonghong123 on 2017/12/13.
 */
@Controller
public class SecurityController {
    @RequestMapping("/in")
    public String index() {
        return "index1";
    }

    @RequestMapping("/he")
    public String hello() {
        return "hello1";
    }


}
