package com.example.demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {
    private final Service topLevel;

    @Autowired
    public App(@Qualifier("bean1") Service topLevel) {
        this.topLevel = topLevel;
    }

    public void run() {
        topLevel.performAction();
    }
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            App app = context.getBean(App.class);
            app.run();
        }
    }
}
