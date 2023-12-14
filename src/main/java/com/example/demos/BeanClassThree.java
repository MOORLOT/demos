package com.example.demos;

public class BeanClassThree implements Service {
    private final String message;

    // Конструктор за замовчуванням для Spring DI
    public BeanClassThree() {
        this.message = null; // або встановіть значення за замовчуванням, якщо потрібно
    }

    public BeanClassThree(String message) {
        this.message = message;
    }



    @Override
    public void performAction() {
        System.out.println("бін 3+  \n" + message);
    }
}
