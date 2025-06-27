package org.example.video.Pojo;

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

    private Long userId;

    private Long tagId;

    private Float weight;
}
