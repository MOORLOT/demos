package com.example.demos;

public class BeanClassTwo implements Service {
    private final BeanClassThree beanClassThree;

    public BeanClassTwo(BeanClassThree beanClassThree) {
        this.beanClassThree = beanClassThree;
    }

    @Override
    public void performAction() {
        System.out.println("бін 2+");
        beanClassThree.performAction();
    }
}
