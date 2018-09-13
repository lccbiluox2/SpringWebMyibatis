package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;

// 返回json字符串的数据，直接可以编写RESTFul的接口
@RestController
// @SpringBootApplication声明让spring boot自动给程序进行必要的配置
@SpringBootApplication
// 添加servlet组件扫描，使得Spring能够扫描到我们编写的servlet和filter
@ServletComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}