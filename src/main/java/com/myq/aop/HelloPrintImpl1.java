package com.myq.aop;

import org.aspectj.lang.annotation.Aspect;

/**
 * created on 18/1/15
 *
 * @author romens
 * @version 1.0
 */
public class HelloPrintImpl1 implements HelloPrint {
    public void printHelloWorld() {
        System.out.println("Enter HelloPrintImpl1.printHelloWorld()");
    }

    public void doPrint() {
        System.out.println("Enter HelloPrintImpl1.doPrint()");
    }
}
