package com.qf.spring.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
//component注解一般是类名首字母小写,一般不写,使用默认的

@Data
public class Product {
    private String name;
    private BigDecimal price;
}
