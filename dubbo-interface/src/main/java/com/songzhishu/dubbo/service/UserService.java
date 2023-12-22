package com.songzhishu.dubbo.service;

import com.songzhishu.dubbo.pojo.User;

public interface UserService {

    public String sayHello();

    /**
     * 查询用户
     */
    public User getUserById(int id);
}
