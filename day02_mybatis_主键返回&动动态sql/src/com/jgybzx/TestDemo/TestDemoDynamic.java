package com.jgybzx.TestDemo;

import com.jgybzx.dao.UserDao;
import com.jgybzx.domain.QueryVo;
import com.jgybzx.domain.User;
import com.jgybzx.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: guojy
 * @date: 2019/12/8 17:42
 * @Description:
 * @version: 动态sql 使用
 */
public class TestDemoDynamic {
    @Test
    //根据id 和 性别查询数据  大于40  男性
    public void findByIdAndName() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setId(40);
        // user.setSex("男");
        List<User> byIdAndName = mapper.findByIdAndName(user);
        for (User user1 : byIdAndName) {
            System.err.println(user1);

        }
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test
    //根据id 和 性别查询数据  大于40  男性，如果传入id，则不使用性别作为条件
    //choose 优先查询
    public void findByIdAndName2() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        User user = new User();
//        user.setId(40);
//         user.setSex("男");
        List<User> byIdAndName = mapper.findByIdAndName2(user);
        for (User user1 : byIdAndName) {
            System.err.println(user1);

        }
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test
    //根据id 和 性别查询数据  大于40  男性，如果传入id，则不使用性别作为条件
    //choose 优先查询
    public void update() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setId(41);
        user.setUsername("set标签修改11111");
        user.setSex("男");
        mapper.update(user);
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test
    //foreach 实现 in 子查询，传递数组
    public void findUserByidInArray() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Integer[] integers = {12, 41, 45, 43};
        List<User> userByidIn = mapper.findUserByidInArray(integers);
        for (User user : userByidIn) {
            System.err.println(user);
        }

        MyBatisUtils.closeSession(sqlSession);
    }

    @Test
    //foreach 实现 in 子查询，
    //UPDATE USER SET username = 'foreach修改',address = 'foreach修改' WHERE id IN (41,42);
    public void UpdateUserByidInList() {
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUsername("foreach修改");
        user.setAddress("foreach修改");
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(41);
        list.add(43);
        list.add(45);
        mapper.UpdateUserByidInList(list, user);
        MyBatisUtils.closeSession(sqlSession);
    }
    @Test
    public void  findByVo(){
        SqlSession sqlSession = MyBatisUtils.openSeesion();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Integer[] integers = {12,42,41};
        QueryVo queryVo = new QueryVo();

        queryVo.setIds(integers);
        List<User> byVo = mapper.findByVo(queryVo);

        MyBatisUtils.closeSession(sqlSession);
    }
}
