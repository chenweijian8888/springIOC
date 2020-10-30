package com.qf.spring.service.impl;

import com.qf.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service("userservice")
public class UserServiceimpl implements UserService {
    @Override
    public int save() {
        System.out.println("oooo");
        return 0;
    }
}
