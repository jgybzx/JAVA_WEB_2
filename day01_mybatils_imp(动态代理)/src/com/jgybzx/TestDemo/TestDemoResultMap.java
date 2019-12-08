package com.jgybzx.TestDemo;

import com.jgybzx.Utils.MyBatisUtils;
import com.jgybzx.domain.User;
import com.jgybzx.复杂查询.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/6 20:53
 * @Description:
 * @version:
 */
public class TestDemoResultMap {
    @Test // resultMap测试
    public void findAllResultMap(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> allResultMap = mapper.findAllResultMap();
        for (User user : allResultMap) {
            System.out.println(user);
        }
        MyBatisUtils.closeSession(sqlSession);
    }
}
