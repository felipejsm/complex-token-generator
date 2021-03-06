package com.nssp.complextokengenerator.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "spring.redis.cluster")
public class ClusterConfigurationProperties {
    List<String> nodes;
}
