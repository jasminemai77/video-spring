package org.example.video.Pojo;

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

    private Long userId;

    private String title;

    private String description;

    private String videoUrl;

    private String coverUrl;

    private Long playCount;

    private Long likeCount;

    private Long coinCount;

    private Long favoriteCount;

    private Long commentCount;

    private String createdAt;
}
