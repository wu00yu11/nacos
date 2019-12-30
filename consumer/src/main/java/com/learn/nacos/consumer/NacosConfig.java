package com.learn.nacos.consumer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: nacos
 * @description:
 * @author: zjj
 * @create: 2019-12-30 16:22
 **/
@Configuration
public class NacosConfig {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
