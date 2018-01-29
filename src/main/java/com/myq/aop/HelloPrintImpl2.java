package com.myq.aop;

/**
 * created on 18/1/15
 *
 * @author romens
 * @version 1.0
 */
public class HelloPrintImpl2 implements HelloPrint {
    public void printHelloWorld() {
        System.out.println("Enter HelloPrintImpl2.printHelloWorld()");
    }

    public void doPrint() {
        System.out.println("Enter HelloPrintImpl2.doPrint()");
    }
}
