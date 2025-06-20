package org.example.easy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    @Autowired
    private GreatingService greatingService;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MainApp app = context.getBean(MainApp.class);
        app.greatingService.sayHello();
    }


}
