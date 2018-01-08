package com.myq.annotation.bean;


import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * created on 18/1/4
 *
 * @author romens
 * @version 1.0
 */
public class MyDataSourceFactory {
//    @Bean("dataSource")
    public DataSource getDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.jdbc.Driver");
        props.setProperty("url", "http://localhost:3306/testDB");
        props.setProperty("username", "root");
        props.setProperty("password", "");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

}
