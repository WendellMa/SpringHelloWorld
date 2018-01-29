package com.myq.aop;

/**
 * created on 18/1/15
 *
 * @author romens
 * @version 1.0
 */
public class LogHandler {
    public void logBefore()
    {
        System.out.println("Log before method");
    }

    public void logAfter()
    {
        System.out.println("Log after method");
    }
}
