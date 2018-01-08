package annotation;

import com.myq.ApplicationConfig;
import com.myq.annotation.controller.RoleController2;
import com.myq.annotation.pojo.Role;
import com.myq.annotation.service.RoleDataSourceService;
import com.myq.annotation.service.RoleDataSourceServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created on 18/1/4
 *
 * @author romens
 * @version 1.0
 */
public class RoleDataSourceServiceImplTest {
    Logger logger = Logger.getLogger(RoleDataSourceServiceImplTest.class);

    @Test
    public void autowired() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        RoleController2 roleController = context.getBean(RoleController2.class);
        RoleDataSourceService roleDataSourceService = context.getBean(RoleDataSourceServiceImpl.class);
        Role role = roleDataSourceService.getRole(1L);
        roleController.printRole(role);
    }
}
