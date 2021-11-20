import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import com.study.service.HelloWebService;

/**
 * @ClassName: Client
 * @Description:
 * @date: 2021/11/18
 * @author zhb
 */
public class Client {
    public static void main(String[] args) {
        //创建调用服务端的代理工厂对象
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        //设置服务的地址
        factoryBean.setAddress("http://localhost:8000/ws/hello");
        //设置接口类型
        factoryBean.setServiceClass(HelloWebService.class);
        //对接口生成代理对象
        HelloWebService helloWebService = factoryBean.create(HelloWebService.class);
        //代理对象生成 【Java代理：1.静态代理；2.动态代理（jdk接口代理、cglib子类代理）】$CGLIB12312
        System.out.println(helloWebService);
        //远程访问服务端方法
        String zhb = helloWebService.sayHello("zhb");
        System.out.println(zhb);
    }
}
