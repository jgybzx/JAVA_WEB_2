package com.jgybzx.模糊查询;


import com.jgybzx.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/6 20:24
 * @Description:
 * @version:
 */
public interface UserDao {
    public List<User> findByName1(String username);

    public List<User> findByName2(String username);

    public List<User> findByName3(String username);
    public List<User> findByName4(String username);
}
