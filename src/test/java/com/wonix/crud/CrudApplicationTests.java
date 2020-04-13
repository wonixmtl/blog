package com.wonix.crud;

import com.wonix.crud.entities.Blog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class CrudApplicationTests
{
    /*@Autowired
    JdbcTemplate jdbcTemplate;*/

    @Test
    void contextLoads() throws IOException, SQLException
    {
        /*Blog blog = jdbcTemplate.queryForObject("select * from blogs order by id desc limit 1",new BeanPropertyRowMapper<>(Blog.class));
        System.out.println(blog.getId());
        System.out.println(blog.getTitle());
        System.out.println(blog.getContent());*/
    }


}
