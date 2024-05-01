import com.alibaba.druid.pool.DruidDataSource;
import com.myspring.service.userServiceImpl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userServiceImpl userService = (userServiceImpl)classPathXmlApplicationContext.getBean("userServiceImpl");
        userService.show();
    }
}
