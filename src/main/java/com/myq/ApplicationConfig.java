package com.myq;

import com.myq.pojo.PojoConfig;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * created on 18/1/4
 *
 * @author romens
 * @version 1.0
 */
@ComponentScan(basePackages = {"com.myq.annotation"})
//@Import({PojoConfig.class})
@PropertySource(value = {"classpath:database-config.properties"}, ignoreResourceNotFound = true)
@Configuration
public class ApplicationConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
