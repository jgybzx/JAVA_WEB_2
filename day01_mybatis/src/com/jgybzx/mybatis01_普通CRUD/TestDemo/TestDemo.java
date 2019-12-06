package com.jgybzx.mybatis01_普通CRUD.TestDemo;

import com.jgybzx.mybatis01_普通CRUD.Utils.MyBatisUtils;
import com.jgybzx.mybatis01_普通CRUD.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/6 18:09
 * @Description:
 * @version:
 */
public class TestDemo {
    @Test//查询
    public void select(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        List<User> user = sqlSession.selectList("userMapper.selectAll");
        for (User user1 : user) {
            System.out.println("user1 = " + user1);
        }
        MyBatisUtils.closeSession(sqlSession);
    }
    @Test //新增
    public void insert(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        User user = new User();
        user.setSex("男");
        user.setBirthday(new Date());
        user.setUsername("嫐");
        user.setAddress("北京");
        sqlSession.insert("userMapper.insertUser",user);
        MyBatisUtils.closeSession(sqlSession);
    }
    @Test //修改
    public void update(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        User user = new User();
        user.setId(52);
        user.setSex("男");
        user.setBirthday(new Date());
        user.setUsername("测试修改");
        user.setAddress("北京");
        sqlSession.insert("userMapper.updateUser",user);
        MyBatisUtils.closeSession(sqlSession);
    }
    @Test //删除
    public void delete(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        sqlSession.delete("userMapper.deleteUser",52);
        MyBatisUtils.closeSession(sqlSession);
    }
}
