package com.jgybzx.dao;

import com.jgybzx.domain.User;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/8 20:38
 * @Description:
 * @version:
 */
public interface UserDao {
    public List<User> findUserAll();
}
