package com.qf.spring.service;

import com.qf.spring.bean.ABean;
import com.qf.spring.bean.Product;
import com.qf.spring.bean.User;

import com.qf.spring.contruller.Usercontruller;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        String path="classpath:spring-context.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
       /*Object user = applicationContext.getBean("user");
        System.out.println(user);

        User user1 =applicationContext.getBean("user", User.class);
        System.out.println(user1.toString());*/

       // applicationContext.close();

       /* Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product.toString());*/

        /*ABean aBean = applicationContext.getBean("aBean", ABean.class);
        System.out.println(aBean);

        Usercontruller usercontruller = applicationContext.getBean("usercontruller", Usercontruller.class);
        System.out.println(usercontruller);*/

        UserService userservice = applicationContext.getBean("userservice", UserService.class);
        System.out.println(userservice);
    }
}
