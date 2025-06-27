package org.example.video.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.example.video.Repository.CommentMapper;
import org.example.video.Service.ICommentService;
import org.example.video.entity.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

    private final CommentMapper commentMapper;

    public CommentServiceImpl(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    // 可添加评论业务方法
}
