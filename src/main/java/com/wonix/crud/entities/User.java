package com.wonix.crud.entities;


public class User
{
    private int id;
    private String username;
    private String password;
    private String signature;
    private String ico;

    public User(){}

    public User(int id, String username, String password, String signature, String ico)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.signature = signature;
        this.ico = ico;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getSignature()
    {
        return signature;
    }

    public void setSignature(String signature)
    {
        this.signature = signature;
    }

    public String getIco()
    {
        return ico;
    }

    public void setIco(String ico)
    {
        this.ico = ico;
    }
}
