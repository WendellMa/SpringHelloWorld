package annotation;

import com.myq.annotation.controller.RoleController2;
import com.myq.annotation.pojo.Role;
import com.myq.pojo.PojoConfig;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created on 18/1/4
 *
 * @author romens
 * @version 1.0
 */
public class RoleController2Test {
    Logger logger = Logger.getLogger(RoleController2Test.class);

    @Test
    public void autowired() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        RoleController2 roleController = context.getBean(RoleController2.class);
        Role role = context.getBean(Role.class);
        roleController.printRole(role);
    }
}
