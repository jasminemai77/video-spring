package org.example.video.Pojo;

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

    @TableId(value = "tag_id")
    private Long tagId;

    private String createdAt;
}
