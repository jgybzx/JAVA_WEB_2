package com.jgybzx.dao;

import com.jgybzx.domain.User;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/6 19:46
 * @Description:
 * @version:
 */
public interface UserDao {
    public List<User> findAll() ;
    public void insert(User user) ;//保存
    public void update(User user) ;//更新
    public void delete(Integer id) ;//删除
    public User findById(Integer id) ;//根据id查询
    public Integer findCount() ;//查询总记录数 select count(*) from 表名
}
