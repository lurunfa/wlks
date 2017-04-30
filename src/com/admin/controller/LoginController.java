package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lurunfa on 2017/4/29.
 *
 * @author lurunfa
 * @version 1.0
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @RequestMapping("/login")
    public String index(){
        return "admin/login";
    }
}
