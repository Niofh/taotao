package com.portal.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/24 17:54
 */
public class GlobalException implements HandlerExceptionResolver {
    private static final Logger logger = LoggerFactory.getLogger(GlobalException.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) {
        logger.info("进入全局异常处理器。。。");
        logger.debug("测试handler的类型：" + handler.getClass());
        logger.error("系统发生异常", e);

        //发邮件（采用jmail客户端进行发送）

        //展示错误页面
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("message", "当前网络出现故障，请稍后重试！");

        //返回逻辑视图，这样回去访问error目录下的error.jsp
        modelAndView.setViewName("error/exception");

        return modelAndView;

    }
}
