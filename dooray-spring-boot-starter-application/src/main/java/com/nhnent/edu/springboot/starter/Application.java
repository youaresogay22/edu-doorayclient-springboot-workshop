package com.nhnent.edu.springboot.starter;

import com.nhnent.dooray.client.DoorayHook;
import com.nhnent.dooray.client.DoorayHookSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Autowired
    private DoorayHookSender doorayHookSender;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public ApplicationListener<ApplicationReadyEvent> applicationListener() {
        return (applicationReadyEvent) -> {
            DoorayHook doorayHook = new DoorayHook();
            doorayHook.setBotName("정지범");
            doorayHook.setText("테스트 중!");
            doorayHookSender.send(doorayHook);
        };
    }
}
