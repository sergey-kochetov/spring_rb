package com.juja.spring.impls.robot;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ActionReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("new action!");
        return null;
    }
}
