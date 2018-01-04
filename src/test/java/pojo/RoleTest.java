package pojo;

import com.myq.pojo.JuiceMaker;
import com.myq.pojo.Role;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * created on 17/12/28
 *
 * @author romens
 * @version 1.0
 */
public class RoleTest {
    Logger logger = Logger.getLogger(RoleTest.class);
    @Test
    public void createRole(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean/role.xml");
        Role role1 = (Role) ctx.getBean("role1");
        logger.debug(role1.getRoleName());
        logger.debug(role1.getNote());

        Role role2 = (Role) ctx.getBean("role2");
        logger.debug(role2.getRoleName());
        logger.debug(role2.getNote());
        ctx.close();
    }
}
