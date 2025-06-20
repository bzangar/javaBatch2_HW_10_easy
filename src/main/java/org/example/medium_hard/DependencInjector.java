package org.example.medium_hard;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencInjector {

    @Bean
    public static PaymentProcessor paymentProcessor(){
        return new MasterCardPaymentProcessor();
    }

    @Bean
    public static OrderService orderService() {
        return new OrderService();
    }
}
