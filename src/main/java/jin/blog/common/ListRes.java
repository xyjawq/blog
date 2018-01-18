package jin.blog.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Author: xyjawq
 * Date: 2018/1/16
 * Time: 7:57
 * comment: 组装查询的结果列表
 */

@Setter
@Getter
@ToString
public class ListRes {

    private List items;
    private Integer count;

    public static ListRes wrapList(List items,Integer count){
        ListRes result = new ListRes();
        result.setItems(items);
        result.setCount(count);
        return result;
    }
}
