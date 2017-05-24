package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component @Aspect
public class AspectClass {

	@Before("execution(* com.demo.helloController.HelloController.hello(..))")
    public void logBeforeV1(JoinPoint joinPoint) 
    {
        System.out.println("AspectClass.logBeforeV1() : " + joinPoint.getSignature().getName());
    }
     
	@After("execution(* com.demo.helloController.HelloController.hello(..))")
    public void logBeforeV2(JoinPoint joinPoint) 
    {
        System.out.println("AspectClass.logBeforeV2() : " + joinPoint.getSignature().getName());
    }
}
