package org.example.video.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("video")
public class Video implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("user_id")
    private Long userId;

    @TableField("title")
    private String title;

    @TableField("description")
    private String description;

    @TableField("video_url")
    private String videoUrl;

    @TableField("cover_url")
    private String coverUrl;

    @TableField("play_count")
    private Long playCount;

    @TableField("like_count")
    private Long likeCount;

    @TableField("coin_count")
    private Long coinCount;

    @TableField("favorite_count")
    private Long favoriteCount;

    @TableField("comment_count")
    private Long commentCount;

    @TableField("created_at")
    private String createdAt;
}
