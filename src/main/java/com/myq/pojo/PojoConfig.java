package com.myq.pojo;

import com.myq.annotation.service.RoleServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * created on 17/12/28
 *
 * @author romens
 * @version 1.0
 */
@ComponentScan(basePackageClasses = {com.myq.annotation.pojo.Role.class, RoleServiceImpl.class},
    basePackages = {"com.myq.pojo", "com.myq.annotation"})
@ImportResource({"classpath:bean/spring-dataSource.xml"})
public class PojoConfig {
}
