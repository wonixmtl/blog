package com.wonix.crud.controller;

import com.wonix.crud.dao.BlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogSettingController
{
    @Autowired
    BlogDao blogDao;

    @RequestMapping("/blog_setting")
    public String blogSetting()
    {
        return "blog_setting";
    }
}
