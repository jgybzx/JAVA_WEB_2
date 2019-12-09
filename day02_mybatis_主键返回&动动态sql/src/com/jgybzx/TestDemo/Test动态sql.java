package com.jgybzx.TestDemo;

import com.jgybzx.dao.UserDao;
import com.jgybzx.domain.User;
import com.jgybzx.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

/**
 * @author: guojy
 * @date: 2019/12/8 14:27
 * @Description:
 * @version:
 */
public class Test动态sql {
    //返回插入的数据的id
    @Test
    public void getId() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUsername("动态代理实现");
        user.setSex("男");
        user.setBirthday(new Date());
        user.setAddress("测试添加动态代理实现");
        mapper.getId(user);
        System.err.println(user.getId());
        MyBatisUtils.closeSession(sqlSession);
    }
}
