package com.example.demos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectConfig {

    @Pointcut("execution(* com.example.demos.Service.performAction(..))")
    public void serviceMethods() {
    }

    @Before("serviceMethods()")
    public void beforeServiceMethod(JoinPoint joinPoint) {
        System.out.println("Стан до сервісного методу: " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning(pointcut = "serviceMethods()", returning = "result")
    public void afterReturningServiceMethod(JoinPoint joinPoint, Object result) {
        System.out.println("Стан після сервісного методу: " + joinPoint.getSignature().toShortString());
    }

    @AfterThrowing(pointcut = "serviceMethods()", throwing = "exception")
    public void afterThrowingServiceMethod(JoinPoint joinPoint, Throwable exception) {
        System.out.println("Виклияння в сервісному методі: " + joinPoint.getSignature().toShortString() + ", Exception: " + exception.getMessage());
    }

    @Pointcut("execution(* com.example.demos.BeanClassOne.performAction(..))")
    private void firstLevelServiceMethods() {}

    @Pointcut("execution(* com.example.demos.BeanClassTwo.performAction(..))")
    private void secondLevelServiceMethods() {}

    @Pointcut("firstLevelServiceMethods() || secondLevelServiceMethods()")
    private void combinedPointcut() {}

    @Before("combinedPointcut()")
    public void beforeCombinedPointcut(JoinPoint joinPoint) {
        System.out.println("Стан до виконанням Combined Pointcut: " + joinPoint.getSignature().toShortString());
    }
}
