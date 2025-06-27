package org.example.video.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.example.video.Repository.UserFavoriteVideoMapper;
import org.example.video.Service.IUserFavoriteVideoService;
import org.example.video.entity.UserFavoriteVideo;
import org.springframework.stereotype.Service;

@Service
public class UserFavoriteVideoServiceImpl extends ServiceImpl<UserFavoriteVideoMapper, UserFavoriteVideo> implements IUserFavoriteVideoService {

    private final UserFavoriteVideoMapper userFavoriteVideoMapper;

    public UserFavoriteVideoServiceImpl(UserFavoriteVideoMapper userFavoriteVideoMapper) {
        this.userFavoriteVideoMapper = userFavoriteVideoMapper;
    }

    // 可添加用户收藏业务方法
}
