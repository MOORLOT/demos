package com.example.demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {
    private final Service topLevel0;
    private final Service topLevel1;

    @Autowired
    public App(@Qualifier("bean1") Service topLevel0,@Qualifier ("bean2") Service topLevel1) {
        this.topLevel0 = topLevel0;
        this.topLevel1 = topLevel1;
    }

    public void run() {
        topLevel0.performAction();
        topLevel1.performAction();
    }
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            App app = context.getBean(App.class);
            app.run();
        }
    }
}
