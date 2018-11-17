package com.wx.islandweb.entity;

import java.util.Date;

/**
 * Registry实体类
 * 实现账户注册，登录功能
 */
public class Registry {
    private int userId;
    private String userName;
    private String password;
    private String email;
    private Date registryTime;

    /**
     * 有参构造方法，用于登录的时候做密码校验
     * @param userName
     * @param password
     */
    public Registry(String userName, String password) {
        this.password = password;
        this.userName = userName;
    }

    /**
     * 无参构造方法
     */
    public Registry() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistryTime() {
        return registryTime;
    }

    public void setRegistryTime(Date registryTime) {
        this.registryTime = registryTime;
    }
}
