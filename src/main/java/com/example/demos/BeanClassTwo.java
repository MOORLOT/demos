package com.example.demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bean2")
public class BeanClassTwo implements Service {
    private final BeanClassThree beanClassThree;

    @Autowired
    public BeanClassTwo(@Qualifier("bean3") BeanClassThree beanClassThree) {
        this.beanClassThree = beanClassThree;
    }


    @Override
    public void performAction() {
        System.out.println("бін 2+");
        beanClassThree.performAction();
    }
}
