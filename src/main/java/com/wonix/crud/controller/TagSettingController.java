package com.wonix.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TagSettingController
{
    @RequestMapping("/tag_setting")
    public String tagSetting()
    {
        return "tag_setting";
    }
}
