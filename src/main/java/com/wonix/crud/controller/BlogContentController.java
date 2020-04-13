package com.wonix.crud.controller;

import com.wonix.crud.dao.BlogDao;
import com.wonix.crud.entities.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

@Controller
public class BlogContentController
{
    @Autowired
    BlogDao blogDao;

    @RequestMapping("/blog_content/{id}")
    public String blogContent(@PathVariable("id") Integer id, Model model)
    {
        Blog blog = blogDao.find(id);
        model.addAttribute("blog",blog);
        return "blog_content";
    }
}
