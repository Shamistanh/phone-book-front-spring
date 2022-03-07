package com.front.app.client;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConf {
    @Bean
    public ErrorDecoder basicErrorDecoder() {
        return new ErrorDecoder.Default();
    }
}
