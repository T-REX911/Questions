package com.myTech.QuestionBook.QuestionBook.Config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {
    @Bean
    public Logger logger(){
        return LoggerFactory.getLogger(SpringApplication.class);
    }
}
