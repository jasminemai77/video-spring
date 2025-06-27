package org.example.video.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("user_tag_preference")
public class UserTagPreference implements Serializable {

    @TableId(value = "user_id")
    private Long userId;

    @TableField("tag_id")
    private Long tagId;

    @TableField("weight")
    private Float weight;
}
