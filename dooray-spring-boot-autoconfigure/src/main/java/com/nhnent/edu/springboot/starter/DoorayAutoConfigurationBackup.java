package com.nhnent.edu.springboot.starter;

import com.nhnent.dooray.client.DoorayHookSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * TODO
 * 1) 아래 선언은 DoorayHookSender.class 가 Classpath 에 존재할때,
 * 2) RestTemplate type 의 빈이 선언되어 있을때.
 * 3) dooray.hook-url 속성이 정의되어 있을때,
 * 동작하도록 설정 하세요.
 */
//@Configuration
//@EnableConfigurationProperties(DoorayProperties.class)
public class DoorayAutoConfigurationBackup {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DoorayProperties doorayProperties;

    /**
     * TODO DoorayHookSender 객체를 생성해서 반환합니다.
     * @return
     */
    @Bean
    public DoorayHookSender doorayHookSender() {
        return null;
    }


}
