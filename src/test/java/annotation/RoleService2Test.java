package annotation;

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
public class RoleService2Test {
    Logger logger = Logger.getLogger(RoleService2Test.class);

    @Test
    public void autowired() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PojoConfig.class);
        RoleServiceImpl2 roleServiceImpl2 = context.getBean(RoleServiceImpl2.class);
        roleServiceImpl2.printRoleInfo();
    }
}
