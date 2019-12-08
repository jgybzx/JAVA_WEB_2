package com.jgybzx.复杂查询;


import com.jgybzx.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/6 20:24
 * @Description:
 * @version:
 */
public interface UserDao {
    //解决实体类和数据库表字段不一致问题
    public List<User> findAllResultMap();

    //查询 id大于 30 性别为男的 ，agr数组和param方式
    public List<User> findAllByCondition1(Integer id, String sex);

    public List<User> findAllByCondition2(Integer id, String sex);

    //使用@Param 给参数起名字 告诉xml配置文件中 应该如何获取
    public List<User> findAllParam(@Param("id") Integer id, @Param("gender") String sex);
    //将参数封装成对象，传递一个参数
    public List<User> findAllByPoJo(User user);

}
