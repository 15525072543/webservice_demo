import com.study.serviceImpl.HelloWebServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @ClassName: Service
 * @Description:Webservice服务端发布类
 * @date: 2021/11/18
 * @author zhb
 */
public class Service {
    public static void main(String[] args) {
        //发布服务的工厂
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        //设置服务地址
        factoryBean.setAddress("http://localhost:8000/ws/hello");
        //设置服务类
        factoryBean.setServiceBean(new HelloWebServiceImpl());
        //添加日志输入输出拦截器，观察soap请求、soap响应内容
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        //发布服务
        factoryBean.create();
        System.out.println("发布服务成功，端口8000......");
    }
}
