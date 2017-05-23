package com.jk.service;

import com.jk.entity.User;
import com.jk.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dell on 2017/5/23.
 */
@Service
public class UserServiceImp implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> test() {
        return userMapper.getUserList();
    }
}
