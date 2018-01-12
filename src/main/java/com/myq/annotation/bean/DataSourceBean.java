package com.myq.annotation.bean;


import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * created on 18/1/4
 *
 * @author romens
 * @version 1.0
 */
@Component
public class DataSourceBean {
    @Value("${jdbc.database.driver}")
    private String driver = "";

    @Value("${jdbc.database.url}")
    private String url = "";

    @Value("${jdbc.database.username}")
    private String username = "";

    @Value("${jdbc.database.password}")
    private String password = "";

    @Bean("dataSource")
    public DataSource getDataSource() {
        Properties props = new Properties();
//        props.setProperty("driver", "com.mysql.jdbc.Driver");
//        props.setProperty("url", "jdbc:mysql://localhost:3306/mybatis");
//        props.setProperty("username", "root");
//        props.setProperty("password", "");
        props.setProperty("driver", driver);
        props.setProperty("url", url);
        props.setProperty("username", username);
        props.setProperty("password", password);
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

}
