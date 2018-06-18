package com.nhnent.edu.springboot.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * TODO : application.property 에서 dooray.hook-url 을 받을 수 있도록 속성을 선언하세요.
 */
@ConfigurationProperties(prefix="dooray")
public class DoorayPropertiesBackup {
}
