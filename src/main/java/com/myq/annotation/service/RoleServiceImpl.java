package com.myq.annotation.service;

import com.myq.annotation.pojo.Role;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * created on 17/12/28
 *
 * @author romens
 * @version 1.0
 */
@Component("roleService")
public class RoleServiceImpl implements RoleService {
    private Logger logger = Logger.getLogger(RoleServiceImpl.class);

    public void printRoleInfo(Role role) {
        logger.debug(role.getId());
        logger.debug(role.getRoleName());
        logger.debug(role.getNote());
    }
}
