package com.qf.spring.contruller;

import com.qf.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class Usercontruller {
    //找的是service层的方法名,名字不一样会报错,所以在service层定义名字
    //@Resource(name = "userservice",type = UserService.class)





    @Autowired
    @Qualifier("userservice") //这里写名字,两个代码相当于Resource
    //autowired   相当于以前的 private UserService userService=new UserService
    private UserService userService;

   /* @Autowired
    public void setUserService(UserService userService){
        this.userService=userService;
    }

    @Autowired
    public Usercontruller(UserService userService){
        this.userService=userService;
    }*/
}
