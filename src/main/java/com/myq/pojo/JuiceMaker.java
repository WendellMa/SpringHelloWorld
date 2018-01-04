package com.myq.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * created on 17/12/28
 *
 * @author romens
 * @version 1.0
 */
public class JuiceMaker implements BeanFactoryAware, BeanNameAware,
    ApplicationContextAware, InitializingBean {
    public String beverageShop = null;
    private Source source = null;

    public String makeJuice() {
        String juice = "这是一杯由" + beverageShop + "饮品店,提供的" + source.getSize() + source.getSugar() + source.getFruit();
        return juice;
    }

    public String getBeverageShop() {
        return beverageShop;
    }

    public void init() {
        System.out.println("[" + this.getClass().getSimpleName() + "]执行自定义初始化方法");
    }

    public void destroy() {
        System.out.println("[" + this.getClass().getSimpleName() + "]执行自定义销毁方法");
    }

    public void setBeverageShop(String beverageShop) {
        this.beverageShop = beverageShop;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("[" + this.getClass().getSimpleName() +
            "]调用BeanFactoryAware的setBeanFactory方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("[" + this.getClass().getSimpleName() +
            "]调用InitializingBean的afterPropertiesSet方法");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("[" + this.getClass().getSimpleName() +
            "]调用ApplicationContextAware的setApplicationContext方法");
    }

    public void setBeanName(String s) {
        System.out.println("[" + this.getClass().getSimpleName() +
            "]调用BeanNameAware的setBeanName方法");
    }
}
