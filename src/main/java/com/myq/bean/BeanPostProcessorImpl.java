package com.myq.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * created on 17/12/28
 *
 * @author romens
 * @version 1.0
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("["+bean.getClass().getSimpleName()+"]对象"+beanName+"开始实例化");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("["+bean.getClass().getSimpleName()+"]对象"+beanName+"实例化完成");
        return bean;
    }
}
