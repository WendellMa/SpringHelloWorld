package com.myq.annotation.service;

import com.myq.annotation.pojo.Role;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * created on 18/1/4
 *
 * @author romens
 * @version 1.0
 */
@Component("roleService3")
@Primary
public class RoleServiceImpl3 implements RoleService {
    private Logger logger = Logger.getLogger(RoleServiceImpl3.class);

    public void printRoleInfo(Role role) {
        logger.debug("id = "+role.getId());
        logger.debug("name = "+role.getRoleName());
        logger.debug("note = "+role.getNote());
    }
}
