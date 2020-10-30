package com.qf.spring.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
/* @Data注解相当于这里全部
*@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
*
*
* */



public class User {
    private String username;
    private String password;
    private Addres addres;
    //这里是一个集合
    private List<Integer>list;
    private Map<String,String>map;


   /* public User(String username, String password) {
        this.username = username;
        this.password = password;
    }*/

    public void init(){
        this.username="heelo";
        System.out.println("init");
    }

    public void destroy(){
        this.username=null;
        System.out.println("对象直接被回收");
    }


}
