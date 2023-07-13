package com.moxi.mogublog.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * mogu-admin 启动类
 *
 * @author 陌溪
 * @date 2020年12月31日21:26:04
 */
@Slf4j
@EnableTransactionManagement
@SpringBootApplication
@EnableOpenApi
@EnableDiscoveryClient
@EnableCaching
@EnableRabbit
@EnableFeignClients("com.moxi.mogublog.commons.feign")
@ComponentScan(basePackages = {
        "com.moxi.mogublog.commons.config",
        "com.moxi.mogublog.commons.fallback",
        "com.moxi.mogublog.utils",
        "com.moxi.mogublog.admin",
        "com.moxi.mogublog.xo.utils",
        "com.moxi.mogublog.xo.service"
})
public class AdminApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(AdminApplication.class, args);
        log.info("----------------CI/CD测试1111111-------------------");
        log.info("----------------CI/CD测试2222222-------------------");

        log.info("----------------CI/CD测试33333-------------------");
        log.info("----------------CI/CD测试44444------------------");


        log.info("----------------CI/CD测试5555-------------------");
        log.info("----------------CI/CD测试66666-----------------");

        log.info("----------------CI/CD测试7777-------------------");
        log.info("----------------CI/CD测试88888-----------------");

        log.info("----------------CI/CD测试88888888888888888888------------------");
        log.info("----------------CI/CD测试888888888888888888888----------------");

    }

    /**
     * 设置时区
     */
    @PostConstruct
    void setDefaultTimezone() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }
}
