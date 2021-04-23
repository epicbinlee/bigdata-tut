package com.tut.quartz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口
 *
 * @author leebin
 * @date 2021/04/22 18:21
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.tut.quartz"})
public class QuartzMainApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(QuartzMainApplication.class, args);
        } catch (Exception e) {
            log.info("定位异常.", e);
        }
    }
}
