package com.burhan.kodluyoruzBitirmeMyBank.common;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }


}
