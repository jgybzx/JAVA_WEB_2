package com.jgybzx.dao;

import com.jgybzx.domain.QueryVo;
import com.jgybzx.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserDao {
    //插入数据，返回id
    public void getId(User user);

    //动态sql  if标签
    //根据id 和 性别查询数据
    public List<User> findByIdAndName(User user);

    //choose  优先查询
    public List<User> findByIdAndName2(User user);

    //使用set，去掉最后一个逗号，update
    public void update(User user);

    //使用 foreach，实现 in  子查询
    public List<User> findUserByidInArray(Integer[] arr);
    @Results({
            //id封装
            @Result(column = "id",property = "id",id = true),
            //普通字段封装，可以省略
            //外键封装
            @Result(property = "要封装 的对象",javaType = List.class,column = "传递的参数",
            many = @Many(select = "Dao的全类名.方法名") )
    })
    public void UpdateUserByidInList(@Param("lsitInt") List<Integer> list, @Param("userinfo") User user);

         public List<User> findByVo(QueryVo queryVo);
}
