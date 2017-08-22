import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jiuzhou on 2017/7/8.
 * spring测试基类，加载配置文件
 */
@ContextConfiguration(locations = "classpath:application/applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestCase {
//    protected Log logger = LogFactory.getLog(getClass());
}
