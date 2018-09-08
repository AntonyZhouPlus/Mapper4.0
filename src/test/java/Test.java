import com.zhouhang.dao.Product;
import com.zhouhang.dao.ProductDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.UUID;

/**
 * @author zhouhang
 * @project_name Mapper4Test
 * @package PACKAGE_NAME
 * @date 2018/9/3
 */
public class Test {
    @org.junit.Test
    public void test(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductDao productDao = ac.getBean(ProductDao.class);
        List<Product> products = productDao.selectAll();
        Product product1 = productDao.selectByPrimaryKey("12345678");
        System.out.println(product1);

        product1.setId(null);
        productDao.insertSelective(product1);



    }
}
