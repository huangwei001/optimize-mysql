package com.test.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SystemControllor {
    @RequestMapping("/")
    public String jump(){
        return "/login";
    }

}
