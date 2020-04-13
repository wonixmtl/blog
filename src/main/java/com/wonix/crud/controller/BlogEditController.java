package com.wonix.crud.controller;

import com.wonix.crud.dao.BlogDao;
import com.wonix.crud.entities.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BlogEditController
{
    @Autowired
    BlogDao blogDao;

    @GetMapping("/blog_edit")
    public String blogEdit()
    {
        return "blog_edit";
    }

    @PostMapping("/blog_edit")
    public String blogAdd(Blog blog)
    {
        blogDao.add(blog);
        return "redirect:/blog_content/" + blog.getId();
    }

    @PutMapping("/blog_edit")
    public String blogUpdate(Blog blog)
    {
        System.out.println(blog.getId());
        return "redirect:/blog_content";
    }
}
