package com.songzhishu.dubbo.pojo;

import java.io.Serializable;

/**
 * @BelongsProject: Dubbo
 * @BelongsPackage: com.songzhishu.dubbo.pojo
 * @Author: 斗痘侠
 * @CreateTime: 2023-12-22  15:02
 * @Description: TODO
 * @Version: 1.0
 */
public class User implements Serializable {
    private int id;
    private String username;
    private String password;


    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + "}";
    }
}

