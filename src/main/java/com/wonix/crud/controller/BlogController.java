package com.wonix.crud.controller;

import com.wonix.crud.dao.BlogDao;
import com.wonix.crud.entities.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController
{
    @Autowired
    BlogDao blogDao;

    @RequestMapping("/blog")
    public String blog(Model model)
    {
        List<Blog> blogs = blogDao.findAll();
        model.addAttribute("blogs",blogs);
        return "blog";
    }
}
