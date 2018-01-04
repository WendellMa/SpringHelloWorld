package com.myq.demo;

/**
 * created on 17/11/13
 *
 * @author romens
 * @version 1.0
 */
public class HelloImpl implements HelloApi {
    private String msg;

    public HelloImpl() {
        this.msg = "empty";
    }

    public HelloImpl(String msg) {
        this.msg = msg;
    }

    public void sayHello() {
        System.out.println(msg);
    }
}
