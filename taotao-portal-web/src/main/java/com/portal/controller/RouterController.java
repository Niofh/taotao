package com.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/24 14:27
 */
@Controller
public class RouterController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/{router}")
    public String router(@PathVariable String router) {
        return router;
    }
}
