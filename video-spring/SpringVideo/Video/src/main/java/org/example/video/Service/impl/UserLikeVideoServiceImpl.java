package org.example.video.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.example.video.Repository.UserLikeVideoMapper;
import org.example.video.Service.IUserLikeVideoService;
import org.example.video.entity.UserLikeVideo;
import org.springframework.stereotype.Service;

@Service
public class UserLikeVideoServiceImpl extends ServiceImpl<UserLikeVideoMapper, UserLikeVideo> implements IUserLikeVideoService {

    private final UserLikeVideoMapper userLikeVideoMapper;

    public UserLikeVideoServiceImpl(UserLikeVideoMapper userLikeVideoMapper) {
        this.userLikeVideoMapper = userLikeVideoMapper;
    }

    // 可添加用户点赞业务方法
}
