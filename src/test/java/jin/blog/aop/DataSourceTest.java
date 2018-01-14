package jin.blog.aop;

import org.junit.Test;

import java.util.Date;

/**
 * Author: xuyongjin
 * Date: 2018/1/7
 * Time: 8:36
 */
public class DataSourceTest {
    @Deprecated
    private void getString1(){
        Date date = new Date(113,8,25);
        System.out.println(date.getYear());
        System.out.println("getString1");
    }

    private void getString2(){
        System.out.println("getString2");;
    }

    @Test
    public void executeTest(){
        getString1();
        getString2();
    }
}
