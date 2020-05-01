import com.aries.crowdfunding.entity.Admin;
import com.aries.crowdfunding.mapper.AdminMapper;
import com.aries.crowdfunding.service.api.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: crowdfunding
 * @description:
 * @author: Aries
 * @create: 2020-04-20 23:45
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-config.xml",
        "classpath:spring-persist-tx.xml"})
public class CrowdTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminService adminService;

    @Test
    public void testTx(){
        Admin admin = new Admin(null, "Tom", "123456",
                "汤姆", "123456@java.com", null);
        adminService.saveAdmin(admin);
    }

    @Test
    public void testConnection(){
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsert(){
        Logger logger = LoggerFactory.getLogger(CrowdTest.class);
        int count = adminMapper.insert(new Admin(null, "18182556558",
                "123456", "Aries",
                "18182556558@163.com", null));
        logger.debug("");
    }

    public void test(){
        int a = 1;
        a=2;
    }
}
