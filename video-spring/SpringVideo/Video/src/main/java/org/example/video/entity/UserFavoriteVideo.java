package org.example.video.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("user_favorite_video")
public class UserFavoriteVideo implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("user_id")
    private Long userId;

    @TableField("video_id")
    private Long videoId;

    @TableField("status")
    private Integer status;

    @TableField("created_at")
    private String createdAt;
}
