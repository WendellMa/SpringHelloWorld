package com.myq.annotation.service;

import com.myq.annotation.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * created on 18/1/4
 *
 * @author romens
 * @version 1.0
 */
@Component
public class RoleDataSourceServiceImpl implements RoleDataSourceService {
    @Autowired
    DataSource dataSource;

    public Role getRole(Long id) {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement ps = null;
        Role role = null;
        try {
            connection = dataSource.getConnection();
            ps = connection.prepareStatement("select id,role_name,note from t_role where id = ?");
            ps.setLong(1, id);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                role = new Role();
                role.setId(resultSet.getLong("id"));
                role.setRoleName(resultSet.getString("role_name"));
                role.setNote(resultSet.getString("note"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return role;
    }
}
