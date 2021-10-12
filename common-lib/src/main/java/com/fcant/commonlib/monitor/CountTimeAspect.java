package com.fcant.commonlib.monitor;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * CountTimeAspect
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 13:25 2021/10/12/0012
 */
@Aspect
@Component
@Slf4j
public class CountTimeAspect {

    @Pointcut("@annotation(CountTime)")
    public void countTime() {

    }

    @Around(value = "@annotation(countTime)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint, CountTime countTime) throws Throwable {
        return proceedingJoinPoint.proceed();
    }
}
