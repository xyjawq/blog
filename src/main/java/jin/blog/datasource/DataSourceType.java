package jin.blog.datasource;

/**
 * Author: xyjawq
 * Date: 2018/1/10
 * Time: 8:15
 * comment: datasource 的类型，如果新增类型，可以在这里进行新增一个类型，在定义对应类型的bean，然后就可以直接通过
 *          注解直接使用了
 */

public enum DataSourceType {
    WRITE,
    READ;
}
