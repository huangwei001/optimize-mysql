package com.test.controllor;

import com.alibaba.fastjson.JSONObject;
import com.test.entity.Role;
import com.test.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/system/role")
public class RoleControllor {

    @Autowired
    private RoleService roleService;

    @GetMapping("/add")
    public String add(){
        return "/system/role/add";
    }

    @PostMapping("/addRole")
    @ResponseBody
    public String addRole(@RequestBody final Role role){
        JSONObject result = new JSONObject();
        roleService.saveRole(role);
        result.put("code", 0);
        result.put("msg", "保存成功!");
        return result.toJSONString();
    }

}
