package jin.blog.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Author: xuyongjin
 * Date: 2018/1/7
 * Time: 10:04
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/application-context.xml","classpath:spring/dispatcher-servlet.xml"})

//@Transactional
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true) //添加事务配置
public class BaseTest {

}
