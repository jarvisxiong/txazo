package org.txazo.java.pattern.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLibProxy - CGLib动态代理
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 21.07.2015
 */
public class CGLibProxy implements MethodInterceptor {

    public Object getProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object result = null;
        System.out.println("Proxy before");
        result = proxy.invokeSuper(object, args);
        System.out.println("Proxy after");
        return result;
    }

}
