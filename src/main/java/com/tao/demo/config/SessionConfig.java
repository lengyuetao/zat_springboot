package com.tao.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by DELL on 2017/7/21.
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 3000)
public class SessionConfig {
}
