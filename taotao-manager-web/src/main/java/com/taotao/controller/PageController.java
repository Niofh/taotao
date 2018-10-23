package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面展示的Controller
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/15 22:13
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    /**
     * 通用page对于jsp的名称
     *
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String itemAdd(@PathVariable String page) {
        return page;
    }
}
