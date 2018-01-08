package com.myq.annotation.controller;

import com.myq.annotation.pojo.Role;
import com.myq.annotation.service.RoleService;
import com.myq.annotation.service.RoleServiceImpl3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * created on 18/1/4
 *
 * @author romens
 * @version 1.0
 */
@Component
public class RoleController {

    @Qualifier("roleService")
    @Autowired
    private RoleService roleService;

    public void printRole(Role role) {
        roleService.printRoleInfo(role);
    }
}
