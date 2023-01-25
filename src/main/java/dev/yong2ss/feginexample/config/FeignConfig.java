package dev.yong2ss.feginexample.config;

import dev.yong2ss.feginexample.feign.logger.FeignCustomLogger;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    //모든 FeignClient Global 설정
    @Bean
    public Logger feignLogger() {
        return new FeignCustomLogger();
    }
}
