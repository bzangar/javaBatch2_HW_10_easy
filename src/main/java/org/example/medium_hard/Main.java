package org.example.medium_hard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;


@Configuration
@ComponentScan("org.example.medium")
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        OrderService orderService = context.getBean(OrderService.class);
        OrderService orderService2 = context.getBean(OrderService.class);
        orderService.makeOrder(BigDecimal.valueOf(100));

        System.out.println(orderService == orderService2);
    }
}
