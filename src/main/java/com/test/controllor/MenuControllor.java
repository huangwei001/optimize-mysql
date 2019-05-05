package com.test.controllor;

import com.alibaba.fastjson.JSONObject;
import com.test.entity.Menu;
import com.test.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/system/menu")
public class MenuControllor {

    @Autowired
    MenuService menuService;

    @GetMapping("/add")
    public String add(){
        return "/system/menu/add";
    }

    @PostMapping("/addMenu")
    @ResponseBody
    public String addMenu(@RequestBody final Menu menu) {
        JSONObject result = new JSONObject();
        try {
            menu.setId(UUID.randomUUID().toString());
            menu.setCreatTime(new Date());
            menu.setUpdateTime(new Date());
            menu.setDeleteFlag(0);
            menuService.saveMenu(menu);
            result.put("code", 0);
            result.put("msg", "保存成功!");
        }catch (Exception e) {
            result.put("code", 500);
            result.put("msg", "保存失败!");
            e.printStackTrace();
            return result.toJSONString();
        }
        return result.toJSONString();
    }

}
