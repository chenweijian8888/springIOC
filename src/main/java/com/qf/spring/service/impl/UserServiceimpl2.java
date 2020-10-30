package com.qf.spring.service.impl;

import com.qf.spring.service.UserService;
import org.springframework.context.annotation.Primary;

//优先
@Primary
public class UserServiceimpl2 implements UserService {
    @Override
    public int save() {
        return 0;
    }
}
