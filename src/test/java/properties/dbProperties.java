package properties;

import com.myq.ApplicationConfig;
import com.myq.annotation.bean.DataSourceBean;
import com.myq.annotation.pojo.Role;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * created on 18/1/12
 *
 * @author romens
 * @version 1.0
 */
public class dbProperties {
    @Test
    public void printProperties(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement ps = null;
        try {
            connection = dataSource.getConnection();
            ps = connection.prepareStatement("select id,role_name,note from t_role where id = ?");
            ps.setLong(1, 1L);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getLong("id"));
                System.out.println(resultSet.getString("role_name"));
                System.out.println(resultSet.getString("note"));
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
    }
}
