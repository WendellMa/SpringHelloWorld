package aop;

import com.myq.aop.HelloPrint;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created on 18/1/15
 *
 * @author romens
 * @version 1.0
 */
public class HelloAopTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/aop.xml");
        HelloPrint helloPrint1 = (HelloPrint) context.getBean("helloPrintImpl1");
        HelloPrint helloPrint2 = (HelloPrint) context.getBean("helloPrintImpl2");
        helloPrint1.printHelloWorld();
        System.out.println();
        helloPrint1.doPrint();

        System.out.println();
        helloPrint2.printHelloWorld();
        System.out.println();
        helloPrint2.doPrint();
    }
}
