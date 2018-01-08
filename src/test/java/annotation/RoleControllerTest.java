package annotation;

import com.myq.annotation.controller.RoleController;
import com.myq.annotation.pojo.Role;
import com.myq.annotation.service.RoleServiceImpl2;
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
public class RoleControllerTest {
    Logger logger = Logger.getLogger(RoleControllerTest.class);

    @Test
    public void autowired() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        RoleController roleController = context.getBean(RoleController.class);
        Role role = context.getBean(Role.class);
        roleController.printRole(role);
    }
}
