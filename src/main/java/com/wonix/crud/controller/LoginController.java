package com.wonix.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
//@RestController
public class LoginController
{
    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map,
                        HttpSession session)
    {
        if(!StringUtils.isEmpty(username) && "123456".equals(password))
        {
            //重定向
            session.setAttribute("loginUser",username);
            return "redirect:/blog";
        }
        else
        {
            map.put("msg","用户名密码错误");
            return "index";
        }
    }
}
