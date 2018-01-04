package com.myq.bean;

import org.springframework.beans.factory.DisposableBean;

/**
 * created on 17/12/28
 *
 * @author romens
 * @version 1.0
 */
public class DisposableBeanImpl implements DisposableBean {
    public void destroy() throws Exception {
        System.out.println("调用接口DisposableBean的destroy方法");
    }
}
