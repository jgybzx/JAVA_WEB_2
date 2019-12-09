package com.jgybzx;

import com.jgybzx.dao.UserDao;
import com.jgybzx.domain.User;
import com.jgybzx.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/8 22:39
 * @Description:
 * @version:
 */
public class TestDemo {
    @Test
    public void test (){
        SqlSession sqlSession = MyBatisUtils.openSeesion();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> userAll = mapper.findUserAll();

        for (User user : userAll) {
            System.out.println(user.getUsername());
        }
        MyBatisUtils.closeSession(sqlSession);
    }







    
}
