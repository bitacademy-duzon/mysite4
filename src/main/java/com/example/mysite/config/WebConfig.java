package com.example.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.config.web.MVCConfig;
import com.example.config.web.MessagesConfig;
import com.example.config.web.SecurityConfig;

@Configuration
@ComponentScan("com.example.mysite.controller")
@Import(value= {MVCConfig.class, SecurityConfig.class, MessagesConfig.class})
public class WebConfig {
}
