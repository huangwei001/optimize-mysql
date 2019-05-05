package com.test.controllor;

import com.alibaba.fastjson.JSONObject;
import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/system/user")
public class UserControllor {

    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public String add(){
        return "/system/user/add";
    }

    @PostMapping("/addUser")
    @ResponseBody
    public String addUser(@RequestBody final User user) {

        JSONObject result = new JSONObject();

        userService.saveUser(user);

        result.put("code", 0);
        result.put("msg", "保存成功!");
        return result.toJSONString();
    }
}
