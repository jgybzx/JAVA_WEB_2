package com.jgybzx.dao;

import com.jgybzx.domain.QueryVo;
import com.jgybzx.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/8 14:24
 * @Description:
 * @version:
 */
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

    public void UpdateUserByidInList(@Param("lsitInt") List<Integer> list, @Param("userinfo") User user);

         public List<User> findByVo(QueryVo queryVo);
}
