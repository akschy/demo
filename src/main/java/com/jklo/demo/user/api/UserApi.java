package com.jklo.demo.user.api;

import com.jklo.demo.user.domain.UserEntity;
import com.jklo.demo.user.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <P>
 *
 * </p>
 *
 * @author 常昊阳 haoyang.chang@elitesland.com
 * @version 1.0
 * @since 2020/8/7 0007
 */
@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUser")
    public List<UserEntity> getUser() {
        return userMapper.getUser();
    }
}
