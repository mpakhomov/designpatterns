package com.mpakhomov.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Proxy design pattern implemented using Java Dynamic Proxy API
 *
 * @author mpakhomov
 * @since 9/11/2015
 */
public class DynamicProxy {

    private final static InvocationHandler handler = new SubjectInvocationHandler();
    private final static Subject realSubject = new RealSubject();


    public static Subject createProxy() {
        return (Subject) Proxy.newProxyInstance(
                Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                handler
        );
    }

    private static class SubjectInvocationHandler implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Proxy before. method: " + method + ", args: " + args);
            Object result = realSubject.isLessThanZero((int)args[0]);
            System.out.println("Proxy after. realSubject.isLessThanZero returned " + result);
            return result;
        }
    }
}
