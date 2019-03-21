package com.example.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.config.app.DBConfig;
import com.example.config.app.MyBatisConfig;

@Configuration
@ComponentScan(value= {"com.example.mysite.service", "com.example.mysite.repository"})
@Import(value={ DBConfig.class, MyBatisConfig.class })
public class AppConfig {
}