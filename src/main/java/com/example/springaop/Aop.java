package com.example.springaop;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    private final Logger log = LogManager.getLogger(Aop.class);

    @Around("execution(* com.example.springaop.AopService.*(..))")
    public Object aroundServiceFoo(ProceedingJoinPoint pjp) throws Throwable {
        log.info("============\taround AopService before foo");
        Object result = pjp.proceed();
        log.info("============\taround AopService after foo");
        return result;
    }

    @Around("execution(* com.example.springaop.AopController.*(..))")
    public Object aroundControllerFoo(ProceedingJoinPoint pjp) throws Throwable {
        log.info("==========\taround controller before foo");
        Object result = pjp.proceed();
        log.info("==========\taround controller after foo");
        return result;
    }
}
