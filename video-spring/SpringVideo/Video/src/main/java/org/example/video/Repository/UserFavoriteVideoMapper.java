package org.example.video.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.video.entity.UserFavoriteVideo;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserFavoriteVideoMapper extends BaseMapper<UserFavoriteVideo> {
}
