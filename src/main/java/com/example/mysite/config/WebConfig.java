package com.example.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.example.config.web.FileUploadConfig;
import com.example.config.web.MVCConfig;
import com.example.config.web.MessagesConfig;
import com.example.config.web.SecurityConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value= {"com.example.mysite.controller", "com.example.mysite.exception" })
@Import(value= {MVCConfig.class, SecurityConfig.class, MessagesConfig.class, FileUploadConfig.class})
public class WebConfig {
}
