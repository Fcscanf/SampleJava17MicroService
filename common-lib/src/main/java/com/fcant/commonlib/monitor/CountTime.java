package com.fcant.commonlib.monitor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * CountTime
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 下午 13:21 2021/10/12/0012
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CountTime {

    String name();

    String tag();

    boolean flag() default true;
}
