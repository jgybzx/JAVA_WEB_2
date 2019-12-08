package com.jgybzx.TestDemo;

import com.jgybzx.Utils.MyBatisUtils;
import com.jgybzx.domain.User;
import com.jgybzx.模糊查询.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/6 22:09
 * @Description:
 * @version:
 */
public class Test模糊查询 {
    @Test //模糊查询 第一种方式，需要自己手动拼接字符串  username like  '%王%'
    public void findByName1() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        String username = "王";
        List<User> byName1 = mapper.findByName1("%" + username + "%");
        for (User user : byName1) {
            System.out.println(user);
        }
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test //模糊查询 第二种方式，需要自己手动在xml中拼接  username like  '%王%'
    public void findByName2() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        String username = "王";
        List<User> byName1 = mapper.findByName2(username);
        for (User user : byName1) {
            System.out.println(user);
        }
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test //模糊查询 第三种方式，  ${value} 底层是statement，会出现代码注入问题
    public void findByName3() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        String username = "王%' or 1 = '1";
        List<User> byName1 = mapper.findByName3(username);
        for (User user : byName1) {
            System.out.println(user);
        }
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test //模糊查询 第四种方式，  可以使用 concat() 函数 拼接【推荐使用】
    public void findByName4() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        String username = "王";
        List<User> byName1 = mapper.findByName4(username);
        for (User user : byName1) {
            System.out.println(user);
        }
        MyBatisUtils.closeSession(sqlSession);
    }
}
