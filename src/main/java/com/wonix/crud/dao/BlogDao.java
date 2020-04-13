package com.wonix.crud.dao;

import com.wonix.crud.entities.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogDao
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    // 增
    public int add(Blog blog)
    {
        blog.setId(getLastID() + 1);
        String sql = "insert into blogs(id,uid,lid,title,content,hcontent,create_time,update_time) values(?,?,?,?,?,?,now(),now())";
        return jdbcTemplate.update(sql,blog.getId(),0,0,blog.getTitle(),blog.getContent(),blog.getHcontent());
    }

    // 删
    public int delete(int id)
    {
        String sql = "delete from blogs where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    //改
    public int update(int id, String title, String content, String hcontent)
    {
        String sql = "update blogs set title = ?, content = ?, hcontent = ?, update_time = now() where id = ?";
        return jdbcTemplate.update(sql,title,content,hcontent,id);
    }

    // 查出所有
    public List<Blog> findAll()
    {
        String sql = "select * from blogs order by create_time desc limit 7";
        List<Blog> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Blog.class));
        return list;
    }

    // 查出单个对象
    public Blog find(int id)
    {
        String sql = "select * from blogs where id = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Blog.class),id);
    }

    // 获取最后一条记录的ID
    public int getLastID()
    {
        return jdbcTemplate.queryForObject("select id from blogs order by id desc limit 1",int.class);
    }

}
