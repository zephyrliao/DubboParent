package org.lwq;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubbo
@SpringBootApplication
public class ConsumeStarter {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConsumeStarter.class, args);
    }
}
