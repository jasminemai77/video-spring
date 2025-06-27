package org.example.video.Repository;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.video.entity.UserTagPreference;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserTagPreferenceMapper extends BaseMapper<UserTagPreference> {
}

