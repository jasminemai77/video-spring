package org.example.video.Service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.video.Repository.UserMapper;
import org.example.video.Service.IUserService;
import org.example.video.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    // 可添加用户业务方法

    private List<User> GetUser(){
        List<User> users =userMapper.selectList(null);
        System.out.println(users);
        return null;
    }
}
