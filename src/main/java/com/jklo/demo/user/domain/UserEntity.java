package com.jklo.demo.user.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * <P>
 *
 * </p>
 *
 * @author 常昊阳 haoyang.chang@elitesland.com
 * @version 1.0
 * @since 2020/8/7 0007
 */
@Data
@EqualsAndHashCode
public class UserEntity {

    String name;

    Long id;

    BigDecimal saving;
}
