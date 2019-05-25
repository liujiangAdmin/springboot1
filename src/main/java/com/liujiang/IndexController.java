package com.liujiang;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author isaac
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errcode", 0);
        jsonObject.put("errmsg", "项目启动成功");
        return jsonObject.toString();
    }

    public static void main(String[] args) {
        JSONObject object1 = new JSONObject();
        JSONObject object2 = new JSONObject();
        System.out.println(object1 == object2);
        System.out.println(object2.equals(object2));
    }
}
