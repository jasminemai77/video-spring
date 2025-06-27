package org.example.video.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.example.video.Repository.UserTagPreferenceMapper;
import org.example.video.Service.IUserTagPreferenceService;
import org.example.video.entity.UserTagPreference;
import org.springframework.stereotype.Service;

@Service
public class UserTagPreferenceServiceImpl extends ServiceImpl<UserTagPreferenceMapper, UserTagPreference> implements IUserTagPreferenceService {

    private final UserTagPreferenceMapper userTagPreferenceMapper;

    public UserTagPreferenceServiceImpl(UserTagPreferenceMapper userTagPreferenceMapper) {
        this.userTagPreferenceMapper = userTagPreferenceMapper;
    }

    // 可添加用户标签偏好业务方法

}
