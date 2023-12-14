package com.example.demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bean1")
public class BeanClassOne implements Service {
    private final BeanClassTwo beanClassTwo;

    @Autowired
    public BeanClassOne(@Qualifier("bean2") BeanClassTwo beanClassTwo) {
        this.beanClassTwo = beanClassTwo;
    }

    @Override
    public void performAction() {
        System.out.println("бін 1+");
        beanClassTwo.performAction();
    }
}
