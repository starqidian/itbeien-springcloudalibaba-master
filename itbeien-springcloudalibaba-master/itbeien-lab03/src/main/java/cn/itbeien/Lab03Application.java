package cn.itbeien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author beien
 * @date 2024-04-13 16:22
 * Copyright© 2024 beien
 */
@SpringBootApplication
@EnableDiscoveryClient //开启服务注册与发现
public class Lab03Application {
    public static void main(String[] args) {
        SpringApplication.run(Lab03Application.class,args);
    }
}
