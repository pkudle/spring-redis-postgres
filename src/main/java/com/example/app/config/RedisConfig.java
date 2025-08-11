package com.example.app.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
public class RedisConfig {

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
    RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
    config.setHostName("master.my-redis-v1.mkpp9f.aps1.cache.amazonaws.com");
    config.setPort(6582);

        LettuceClientConfiguration clientConfig = LettuceClientConfiguration.builder()
            .useSsl()
            .build();

        return new LettuceConnectionFactory(config, clientConfig);
    }

}
