package com.example.demos;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean3")
public class BeanClassThree implements Service {
    private String message;

    @Value("${third.level.message}")
    private String defaultMessage;

    @PostConstruct
    public void init() {
        this.message = defaultMessage;
    }

    @Override
    public void performAction() {
        System.out.println("бін 3+  \n" + message);
    }
}
