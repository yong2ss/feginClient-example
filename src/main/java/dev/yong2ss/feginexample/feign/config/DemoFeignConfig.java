package dev.yong2ss.feginexample.feign.config;

import dev.yong2ss.feginexample.feign.decoder.DemoFeignErrorDecoder;
import dev.yong2ss.feginexample.feign.interceptor.DemoFeignInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoFeignConfig {

    @Bean
    public DemoFeignInterceptor feignInterceptor() {
        return DemoFeignInterceptor.of();
    }

    @Bean
    public DemoFeignErrorDecoder demoFeignErrorDecoder() {
        return new DemoFeignErrorDecoder();
    }
}
