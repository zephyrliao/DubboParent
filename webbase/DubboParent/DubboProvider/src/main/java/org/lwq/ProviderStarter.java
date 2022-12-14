package org.lwq;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubbo
@SpringBootApplication
@DubboComponentScan(basePackages = "com.lwq.service.imp")
public class ProviderStarter {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ProviderStarter.class, args);
    }
}
