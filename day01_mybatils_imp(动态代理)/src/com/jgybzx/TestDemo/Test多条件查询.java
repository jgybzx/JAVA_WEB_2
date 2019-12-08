package com.jgybzx.TestDemo;

import com.jgybzx.Utils.MyBatisUtils;
import com.jgybzx.domain.User;
import com.jgybzx.复杂查询.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/6 21:20
 * @Description: 多条件查询 四种方式
 * @version:
 */
public class Test多条件查询 {
    @Test //id大于 30 性别为男的 ，agr数组和param方式
    public void  findAllByCondition1(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.findAllByCondition1(30, "男");
        for (User user : users) {
            System.out.println(user);
        }
        MyBatisUtils.closeSession(sqlSession);
    }
    @Test //id大于 30 性别为男的 ，agr数组和param方式
    public void  findAllByCondition2(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.findAllByCondition2(30, "男");
        for (User user : users) {
            System.out.println(user);
        }
        MyBatisUtils.closeSession(sqlSession);
    }
    @Test //id大于 30 性别为男的 ，@param方式
    public void  findAllParam(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.findAllParam(30, "男");
        for (User user : users) {
            System.out.println(user);
        }
        MyBatisUtils.closeSession(sqlSession);
    }
    @Test //id大于 30 性别为男的 ，实体类方式
    public void  findAllByPoJo(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(30);
        user.setSex("男");
        List<User> users = mapper.findAllByPoJo(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
        MyBatisUtils.closeSession(sqlSession);
    }
}
