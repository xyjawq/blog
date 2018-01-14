package jin.blog.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Author: xyjawq
 * Date: 2018/1/10
 * Time: 8:12
 * comment: 通过继承AbstractRoutingDataSource实现datasource的动态路由切换功能
 */

public class DataSourceSelector extends AbstractRoutingDataSource{

    //让routing决定以什么为标准查询datasource，当然这里的和setTargetDataSources有关系
    @Override
    public Object determineCurrentLookupKey(){
        return DataSourceHolder.getDataSourceType();
    }
}
