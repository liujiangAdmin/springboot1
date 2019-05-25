package com.liujiang.testUtil;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 测试spring-session
 */

@RestController
@RequestMapping(value = "/testSpringSession2")
public class TestSpringSession2 {
    @RequestMapping(method = RequestMethod.GET, value = "/getSpringSession")
    public String getSpringSession(HttpServletRequest request) {
        return request.getSession().getId() + ":" + request.getSession().getAttribute("springSession");
    }
}
