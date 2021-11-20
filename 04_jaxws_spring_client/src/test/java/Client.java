import com.study.service.HelloWebService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ClassName: Client
 * @Description:
 * @date: 2021/11/19
 * @author zhb
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Client {
    @Resource
    private HelloWebService helloWebService;

    @Test
    public void remote(){
        //查看代理对象类型
        System.out.println(helloWebService.getClass());
        //远程访问服务方法
        System.out.println(helloWebService.sayHello("zhb"));
    }

}
