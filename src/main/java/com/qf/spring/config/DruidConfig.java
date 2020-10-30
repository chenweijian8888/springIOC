package com.qf.spring.config;

import com.qf.spring.bean.Addres;
import com.qf.spring.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidConfig {

    //键值是方法名,有返回值
    /*@Bean
    public User user(Addres addres){
        User user = new User();
        user.setUsername("xx");
        user.setAddres(addres);
        return user;

    }*/

    //这里直接调方法
    @Bean
    public User user(){
        User user = new User();
        user.setUsername("xx");
        user.setAddres(addres());
        return user;

    }


    @Bean
    public Addres addres(){
        return new Addres();
    }


}
