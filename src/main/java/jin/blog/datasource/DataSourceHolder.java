package jin.blog.datasource;


import org.springframework.util.Assert;

/**
 * Author: xyjawq
 * Date: 2018/1/10
 * Time: 8:20
 * comment:
 */

public class DataSourceHolder {

    private static final ThreadLocal<DataSourceType> contextHolder =
            new ThreadLocal<DataSourceType>();

    public static void setCustomerType(DataSourceType dataSourceType) {
        Assert.notNull(dataSourceType, "dataSourceType not null");
        contextHolder.set(dataSourceType);
    }

    public static DataSourceType getDataSourceType(){
        return (DataSourceType) contextHolder.get();
    }

    public static void clearDataSourceType() {
        contextHolder.remove();
    }
}
