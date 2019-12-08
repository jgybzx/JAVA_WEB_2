package com.jgybzx.TestDemo;

import com.jgybzx.Utils.MyBatisUtils;
import com.jgybzx.dao.UserDao;
import com.jgybzx.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/6 19:44
 * @Description:
 * @version:
 */
public class TestDemo {
    @Test //动态代理新增
    public void insert() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUsername("动态代理实现");
        user.setSex("男");
        user.setBirthday(new Date());
        user.setAddress("测试添加动态代理实现");
        mapper.insert(user);
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test //动态代理修改
    public void update() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setId(53);
        user.setUsername("动态代理实现修改");
        user.setSex("男");
        user.setBirthday(new Date());
        user.setAddress("测试添加动态代理实现修改");
        mapper.update(user);
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test //动态代理删除
    public void delete() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Integer id = 51;
        mapper.delete(id);
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test //动态代理查询全部
    public void findAll() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test //动态代理查询一条记录
    public void findById() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Integer id = 53;
        User user = mapper.findById(id);
        System.out.println(user);
        MyBatisUtils.closeSession(sqlSession);

    }

    @Test //动态代理查询，返回一个值
    public void findCount(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Integer count = mapper.findCount();
        System.out.println("count = " + count);
        MyBatisUtils.closeSession(sqlSession);

    }
}
