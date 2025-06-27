package org.example.video.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.video.Pojo.Video;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface VideoMapper extends BaseMapper<Video> {
}
