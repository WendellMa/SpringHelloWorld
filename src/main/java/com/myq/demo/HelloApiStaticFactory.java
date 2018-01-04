package com.myq.demo;

/**
 * created on 17/11/18
 *
 * @author romens
 * @version 1.0
 */
public class HelloApiStaticFactory {
    //工厂方法
    public static HelloApi newInstance(String message) {
        //返回需要的Bean实例
        return new HelloImpl(message);
    }
}
