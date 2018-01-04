package pojo;

import com.myq.annotation.pojo.Role;
import com.myq.annotation.service.RoleService;
import com.myq.pojo.PojoConfig;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created on 17/12/28
 *
 * @author romens
 * @version 1.0
 */
public class RoleScanTest {
    Logger logger = Logger.getLogger(RoleTest.class);

    @Test
    public void createRole() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        Role role = context.getBean(Role.class);
        logger.debug(role.getId());
        logger.debug(role.getRoleName());
        logger.debug(role.getNote());
        RoleService roleService = context.getBean(RoleService.class);
        roleService.printRoleInfo(role);
        context.close();
    }
}
