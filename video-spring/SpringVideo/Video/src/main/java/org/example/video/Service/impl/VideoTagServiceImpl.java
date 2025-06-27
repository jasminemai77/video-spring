package org.example.video.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.example.video.Repository.VideoTagMapper;
import org.example.video.Service.IVideoTagService;
import org.example.video.entity.VideoTag;
import org.springframework.stereotype.Service;

@Service
public class VideoTagServiceImpl extends ServiceImpl<VideoTagMapper, VideoTag> implements IVideoTagService {

    private final VideoTagMapper videoTagMapper;

    public VideoTagServiceImpl(VideoTagMapper videoTagMapper) {
        this.videoTagMapper = videoTagMapper;
    }

    // 可添加视频标签关系业务方法
}
