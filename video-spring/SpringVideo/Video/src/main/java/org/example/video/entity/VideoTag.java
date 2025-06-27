package org.example.video.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("video_tag")
public class VideoTag implements Serializable {

    @TableId(value = "video_id")
    private Long videoId;

    @TableField("tag_id")
    private Long tagId;

    @TableField("created_at")
    private String createdAt;
}
