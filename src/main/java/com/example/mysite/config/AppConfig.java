package com.example.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.example.config.app.DBConfig;
import com.example.config.app.MyBatisConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value= {"com.example.mysite.service", "com.example.mysite.repository", "com.example.mysite.aspect"})
@Import(value={ DBConfig.class, MyBatisConfig.class })
public class AppConfig {
}