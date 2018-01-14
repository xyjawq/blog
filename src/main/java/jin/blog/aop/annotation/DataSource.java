package jin.blog.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: xuyongjin
 * Date: 2018/1/5
 * Time: 8:17
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    String source() default DataSource.DEFAULT;

    public final static String DEFAULT = "write";
    public final static String WRITE = "write";
    public final static String READ = "read";
}
