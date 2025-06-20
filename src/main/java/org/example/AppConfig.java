package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GreatingService greatingService(){
        return new EnglishGreatingService();
    }

    @Bean
    public  MainApp mainApp(){
        return new MainApp();
    }
}
