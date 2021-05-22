package com.nssp.complextokengenerator.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {
    private ClusterConfigurationProperties clusterConfigurationProperties;

    public RedisConfig(ClusterConfigurationProperties clusterConfigurationProperties) {
        this.clusterConfigurationProperties = clusterConfigurationProperties;
    }

}
