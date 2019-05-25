package com.liujiang.testUtil;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 测试spring-session
 */

@RestController
@RequestMapping(value = "/testSpringSession")
public class TestSpringSession {

    @RequestMapping(method = RequestMethod.GET)
    public String printSession(HttpServletRequest request) {
        request.getSession().setAttribute("springSession", "springSession");
        return request.getSession().getId();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getSpringSession")
    public String getSpringSession(HttpServletRequest request) {
        return request.getSession().getId() + ":" + request.getSession().getAttribute("springSession");
    }
}
