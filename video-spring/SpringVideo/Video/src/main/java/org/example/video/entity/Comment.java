package org.example.video.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("comment")
public class Comment implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("video_id")
    private Long videoId;

    @TableField("user_id")
    private Long userId;

    @TableField("content")
    private String content;

    @TableField("created_at")
    private String createdAt;
}
