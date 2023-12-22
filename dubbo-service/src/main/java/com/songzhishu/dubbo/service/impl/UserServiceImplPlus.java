package com.songzhishu.dubbo.service.impl;

import com.songzhishu.dubbo.pojo.User;
import com.songzhishu.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @BelongsProject: Dubbo
 * @BelongsPackage: com.songzhishu.dubbo.service.impl
 * @Author: 斗痘侠
 * @CreateTime: 2023-12-21  19:39
 * @Description: TODO
 * @Version: 1.0
 */
//@Service//将该类交给Spring容器管理
//将该类提供的方法注册到注册中心 设置超时时间  设置重试次数
@Service(version = "plus")
public class UserServiceImplPlus implements UserService {
    @Override
    public String sayHello() {
        return "Hello Dubbo888888";
    }

    @Override
    public User getUserById(int id) {
        System.out.println("plus");
        //模拟网络延迟
        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return new User(1,"张三","123456");
    }
}

