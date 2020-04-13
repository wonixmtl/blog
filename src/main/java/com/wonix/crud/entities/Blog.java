package com.wonix.crud.entities;


import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Blog
{
    private int id;
    private int uid;
    private int lid;
    private String title;
    private String content;
    private String hcontent;
    private Date createTime;
    private Date updateTime;
    private String ext1;
    private String ext2;
    private String ext3;

    public Blog(){}

    public Blog(int id, int uid, int lid, String title, String content, String hcontent, Date createTime, Date updateTime, String ext1, String ext2, String ext3)
    {
        this.id = id;
        this.uid = uid;
        this.lid = lid;
        this.title = title;
        this.content = content;
        this.hcontent = hcontent;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.ext1 = ext1;
        this.ext2 = ext2;
        this.ext3 = ext3;
    }

    public Blog(int id, int uid, int lid, String title, String content, String hcontent, Date createTime, Date updateTime)
    {
        this.id = id;
        this.uid = uid;
        this.lid = lid;
        this.title = title;
        this.content = content;
        this.hcontent = hcontent;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    // 无id
    public Blog(int uid, int lid, String title, String content, String hcontent, Date createTime, Date updateTime)
    {
        this.uid = uid;
        this.lid = lid;
        this.title = title;
        this.content = content;
        this.hcontent = hcontent;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    // 无uid、lid
    public Blog(int id, String title, String content, String hcontent, Date createTime, Date updateTime)
    {
        this.id = id;
        this.title = title;
        this.content = content;
        this.hcontent = hcontent;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    // 无id、uid、lid
    public Blog(String title, String content, String hcontent, Date createTime, Date updateTime)
    {
        this.title = title;
        this.content = content;
        this.hcontent = hcontent;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getUid()
    {
        return uid;
    }

    public void setUid(int uid)
    {
        this.uid = uid;
    }

    public int getLid()
    {
        return lid;
    }

    public void setLid(int lid)
    {
        this.lid = lid;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getHcontent()
    {
        return hcontent;
    }

    public void setHcontent(String hcontent)
    {
        this.hcontent = hcontent;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public String getExt1()
    {
        return ext1;
    }

    public void setExt1(String ext1)
    {
        this.ext1 = ext1;
    }

    public String getExt2()
    {
        return ext2;
    }

    public void setExt2(String ext2)
    {
        this.ext2 = ext2;
    }

    public String getExt3()
    {
        return ext3;
    }

    public void setExt3(String ext3)
    {
        this.ext3 = ext3;
    }
}
