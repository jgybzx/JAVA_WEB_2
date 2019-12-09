package com.jgybzx.dao;

import com.jgybzx.domain.Account;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/8 20:39
 * @Description:
 * @version:
 */
public interface AccountDao {
    public List<Account> findAccountAll();
}
