package com.example.demos;
public class BeanClassOne implements Service {
    private final BeanClassTwo beanClassTwo;

    public BeanClassOne(BeanClassTwo beanClassTwo) {
        this.beanClassTwo = beanClassTwo;
    }

    @Override
    public void performAction() {
        System.out.println("бін 1+");
        beanClassTwo.performAction();
    }
}
