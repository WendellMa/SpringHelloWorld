package com.myq.annotation.service;

import com.myq.annotation.pojo.Role;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * created on 18/1/4
 *
 * @author romens
 * @version 1.0
 */
@Component("RoleService2")
public class RoleServiceImpl2 implements RoleService2 {
    private Logger logger = Logger.getLogger(RoleServiceImpl2.class);
    //@Autowired
    private Role role;
    @Autowired //应用于set
    public void setRole(Role role) {
        this.role = role;
    }

    public void printRoleInfo() {
        logger.debug(role.getId());
        logger.debug(role.getRoleName());
        logger.debug(role.getNote());
    }
}
