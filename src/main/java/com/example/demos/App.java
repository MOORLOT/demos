package com.example.demos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Service topLevelService = context.getBean("bean1", Service.class);
            topLevelService.performAction();
        }
    }
}
