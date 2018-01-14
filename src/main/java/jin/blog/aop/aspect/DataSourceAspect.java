package jin.blog.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.lang.reflect.Method;

/**
 * Author: xuyongjin
 * Date: 2018/1/7
 * Time: 9:10
 */
@Aspect
public class DataSourceAspect {

    //@annotation(jin.blog.aop.annotation.DataSource)
    @Around("execution(* jin.blog.dao.*.*(..))")
    public void setDataSource(ProceedingJoinPoint pjp) throws Throwable{

        System.out.println("setDataSource");
        //todo:这里只是配置如何选择datasource，如果是多个datasource，需要先配置datasourceRouting.着重查一下AbstractRoutingDataSource的实现
        try {
            pjp.proceed();
        }catch (Exception e){
            System.out.printf("error");

        }
    }
}
