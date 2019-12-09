package com.jgybzx.TestDemo;

import com.jgybzx.dao.AccountDao;
import com.jgybzx.dao.UserDao;
import com.jgybzx.domain.Account;
import com.jgybzx.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MyBatisUtils;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/8 21:29
 * @Description:
 * @version:
 */
public class TestDemo {
    @Test // 查询全部的账户信息，并显示出用户信息
    public  void findUserAll (){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> accountAll = mapper.findUserAll();
        for (User user : accountAll) {
            System.err.println(user);

        }
        MyBatisUtils.closeSession(sqlSession);
    }
}
