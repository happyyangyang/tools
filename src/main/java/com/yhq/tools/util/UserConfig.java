package com.yhq.tools.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : yanghuiqing
 * @version V1.0
 * @Project: tools
 * @Package com.yhq.tools.util
 * @Description: 配置文件映射到UserConfig
 * @date Date : 2020年07月25日 20:27
 */

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "user")
public class UserConfig {

    private  String userName;

    private String sex;


}
