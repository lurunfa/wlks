package com.admin.controller;

import com.admin.entity.Json;
import com.admin.entity.User;
import com.admin.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;

/**
 * 登录controller类
 *
 * @author lurunfa
 * @version 1.0
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Resource(name = "loginServiceImpl")
    private LoginService loginService;

    /**
     * 默认页面
     *
     * @param request
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    private String index(HttpServletRequest request, Model model) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "admin/login";
        } else {
            model.addAttribute("user",user);
            return "admin/main";
        }
    }

    /**
     * 登录验证账号密码 成功则存session
     *
     * @param name
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Json login(String name, String password, HttpSession session) {
        Json json = loginService.isValid(name, password);
        if (json.getSuccess()) {
            session.setAttribute("user", json.getObject());
        }
        return json;

    }

    @RequestMapping("/welcome")
    public String welcome(HttpSession session){
        if (session.getAttribute("user")==null){
            return "admin/login";
        }
        return "admin/welcome";
    }
    public Json logout(HttpSession session, HttpContext context,HttpServletRequest request){
        Json json = new Json();
        if (session.getAttribute("user")!=null){
            session.removeAttribute("user");
        }
        return json;
    }
}
