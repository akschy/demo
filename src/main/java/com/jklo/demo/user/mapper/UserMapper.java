package com.jklo.demo.user.mapper;

import com.jklo.demo.user.domain.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
@Mapper
@Repository
public interface UserMapper {

    List<UserEntity> getUser();
}
