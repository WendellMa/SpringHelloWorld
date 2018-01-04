package pojo;

import com.myq.pojo.JuiceMaker;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * created on 17/12/28
 *
 * @author romens
 * @version 1.0
 */
public class JuiceMakerTest {
    Logger logger = Logger.getLogger(JuiceMaker.class);

    @Test
    public void makeJuice() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean/juiceMaker.xml");
        JuiceMaker juiceMaker = (JuiceMaker) ctx.getBean("juiceMaker");
        String juice = juiceMaker.makeJuice();
        logger.debug(juice);
        ctx.close();
    }
}
