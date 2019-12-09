package com.jgybzx.TestDemo;

import com.jgybzx.Utils.MyBatisUtils;
import com.jgybzx.dao.AccountDao;
import com.jgybzx.domain.Account;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/8 22:07
 * @Description:
 * @version:
 */
public class test {
    @Test //一对一嵌套查询
    public void testAccount(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> accountAll = mapper.findAccountAll();
        for (Account account : accountAll) {
            System.out.println(account);


        }
        MyBatisUtils.closeSession(sqlSession);
    }
}
