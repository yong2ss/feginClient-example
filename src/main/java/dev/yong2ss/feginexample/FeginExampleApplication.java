package dev.yong2ss.feginexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeginExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginExampleApplication.class, args);
    }

}
