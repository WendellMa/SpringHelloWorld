package demo;

import com.myq.demo.HelloApi;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created on 17/11/13
 *
 * @author romens
 * @version 1.0
 */
public class HelloTest {
    @Test
    public void testHelloWorld(){
        //1、读取配置文件实例化一个IoC容器
//        ApplicationContext context = new ClassPathXmlApplicationContext("demo/helloworld.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("demo/namingbean1.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
//        HelloApi helloApi = context.getBean("bean1", HelloApi.class);
//        HelloApi helloApi2 = context.getBean("bean2", HelloApi.class);
//        HelloApi helloApi = context.getBean( HelloApi.class);
        //3、执行业务逻辑
//        helloApi.sayHello();
//        helloApi2.sayHello();
        BeanFactory beanFactory =
            new ClassPathXmlApplicationContext("demo/namingbean6.xml");
        //根据id获取bean
        HelloApi bean = beanFactory.getBean("bean", HelloApi.class);
        bean.sayHello();
        //根据别名获取bean
        HelloApi alias1 = beanFactory.getBean("alias1", HelloApi.class);
        alias1.sayHello();
        HelloApi alias2 = beanFactory.getBean("alias2", HelloApi.class);
        alias2.sayHello();
        String[] beanAlias = beanFactory.getAliases("bean");
        System.out.println("=======namingbean6.xml bean 别名========");
        for(String alias : beanAlias) {
            System.out.println(alias);
        }
        System.out.println("=======namingbean6.xml bean 别名========");
        Assert.assertEquals(2, beanAlias.length);
    }
}
