package org.example.video;

import org.example.video.Repository.UserMapper;
import org.example.video.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VideoApplicationTests {

    @Autowired
    UserMapper userMapper;

    // 可添加用户业务方法



    @Test
    void contextLoads() {
        List<User> users =userMapper.selectList(null);
        System.out.println(users);
    }


}
