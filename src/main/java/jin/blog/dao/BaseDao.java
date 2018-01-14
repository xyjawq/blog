package jin.blog.dao;

import java.util.List;
import java.util.Map;

/**
 * Author: xuyongjin
 * Date: 2018/1/5
 * Time: 8:33
 */
public interface BaseDao<T> {
    List<T> list(Map params);

    Integer count(Map params);

    void create(T obj);

    void update(T Obj);

    void delete(Long id);
}
