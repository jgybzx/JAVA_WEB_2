package com.jgybzx.TestDemo;

import com.jgybzx.Utils.MyBatisUtils;
import com.jgybzx.dao.AccountDao;
import com.jgybzx.domain.Account;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/8 20:49
 * @Description:
 * @version:
 */
public class TestDemo {
    @Test // 查询全部的账户信息，并显示出用户信息
    public  void findAccountAll (){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> accountAll = mapper.findAccountAll();
        for (Account account : accountAll) {
            System.err.println(account);
        }

        MyBatisUtils.closeSession(sqlSession);
    }
}
