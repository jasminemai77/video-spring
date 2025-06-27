package org.example.video.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.example.video.Repository.VideoMapper;
import org.example.video.Service.IVideoService;
import org.example.video.entity.Video;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements IVideoService {

    private final VideoMapper videoMapper;

    public VideoServiceImpl(VideoMapper videoMapper) {
        this.videoMapper = videoMapper;
    }

    // 可添加视频业务方法
}
