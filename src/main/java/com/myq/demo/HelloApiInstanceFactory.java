package com.myq.demo;

/**
 * created on 17/11/18
 *
 * @author romens
 * @version 1.0
 */
public class HelloApiInstanceFactory {
    public HelloApi newInstance(String message) {
        return new HelloImpl(message);
    }
}
