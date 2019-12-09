package com.jgybzx.domain;

import java.util.Arrays;
import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/8 20:01
 * @Description:
 * @version: 此对象专门用于查询数据库时候封装数据使用
 */
public class QueryVo {
    public QueryVo() {
    }

    private Integer[] ids ;//数组
    private List myList;//集合

    @Override
    public String toString() {
        return "QueryVo{" +
                "ids=" + Arrays.toString(ids) +
                ", myList=" + myList +
                '}';
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public List getMyList() {
        return myList;
    }

    public void setMyList(List myList) {
        this.myList = myList;
    }

    public QueryVo(Integer[] ids, List myList) {
        this.ids = ids;
        this.myList = myList;
    }
}
