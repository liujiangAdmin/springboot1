package com.liujiang.interceptor;

import com.liujiang.util.exception.InterfaceException;
import net.sf.json.JSONObject;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author isaac
 * @since 1.0.0
 */
@Configuration
public class TestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws InterfaceException ,Exception{
        System.out.println("preHandle111111111");
        return true; //通过，继续下一个流程


        //throw new InterfaceException(-1,"全局异常测试"); //抛出异常

        /*返回不通过
        response.setContentType("application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code","-1");
        response.getWriter().write(jsonObject.toString());
        return false;*/
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        //System.out.println("preHandle222222222");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
        //System.out.println("preHandle333333333");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
       // System.out.println("preHandle444444444");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        //System.out.println("preHandle555555555");
    }

}
