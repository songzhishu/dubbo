package com.songzhishu.dubbo.controller;

import com.songzhishu.dubbo.pojo.User;
import com.songzhishu.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: Dubbo
 * @BelongsPackage: com.songzhishu.dubbo.controller
 * @Author: 斗痘侠
 * @CreateTime: 2023-12-21  19:55
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    //注入Service
    //@Autowired 本地注入

    /**
     * 从注册中心获取服务
     * 远程调用rpc
     * 将结果封装为一个代理对象 ,给变量赋值
     *
     */

    @Reference(version = "low")//远程注入
    private UserService userService;


    @RequestMapping("sayHello")
    public String sayHello(){
        return userService.sayHello();
    }

    @RequestMapping("find")
    public User find(int id){
       //方法调用时,打印时间
        new Thread(new Runnable()   {
            @Override
            public void run() {
                while (true){
                    System.out.println("调用时间"+System.currentTimeMillis());

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }).start();
        return userService.getUserById(id);
    }

}

