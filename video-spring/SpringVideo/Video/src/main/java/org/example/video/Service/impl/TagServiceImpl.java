package org.example.video.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.example.video.Repository.TagMapper;
import org.example.video.Service.ITagService;
import org.example.video.entity.Tag;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

    private final TagMapper tagMapper;

    public TagServiceImpl(TagMapper tagMapper) {
        this.tagMapper = tagMapper;
    }

    // 可添加标签业务方法
}
