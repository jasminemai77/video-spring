package org.example.video.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.example.video.Repository.UserCoinVideoMapper;
import org.example.video.Service.IUserCoinVideoService;
import org.example.video.entity.UserCoinVideo;
import org.springframework.stereotype.Service;

@Service
public class UserCoinVideoServiceImpl extends ServiceImpl<UserCoinVideoMapper, UserCoinVideo> implements IUserCoinVideoService {

    private final UserCoinVideoMapper userCoinVideoMapper;

    public UserCoinVideoServiceImpl(UserCoinVideoMapper userCoinVideoMapper) {
        this.userCoinVideoMapper = userCoinVideoMapper;
    }

    // 可添加用户投币业务方法
}
