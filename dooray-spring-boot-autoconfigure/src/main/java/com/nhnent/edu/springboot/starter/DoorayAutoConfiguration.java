package com.nhnent.edu.springboot.starter;

import com.nhnent.dooray.client.DoorayHookSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConditionalOnClass({DoorayHookSender.class})
@ConditionalOnProperty(prefix = "dooray", name="hook-url")
@EnableConfigurationProperties(DoorayProperties.class)
public class DoorayAutoConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }

    @Autowired
    private DoorayProperties doorayProperties;

    @Bean
    public DoorayHookSender doorayHookSender(RestTemplate restTemplate) {
        DoorayHookSender doorayHookSender = new DoorayHookSender(restTemplate, doorayProperties.getHookUrl());
        return doorayHookSender;
    }


}
