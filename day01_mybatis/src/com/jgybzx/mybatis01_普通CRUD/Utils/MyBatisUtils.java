package com.jgybzx.mybatis01_普通CRUD.Utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: guojy
 * @date: 2019/12/6 18:00
 * @Description: mybati
 * @version:
 */
public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory =null;
    static {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取 SQLSession
    public static SqlSession openSeesion(){
        return sqlSessionFactory.openSession();
    }
    //释放资源
    public static void closeSession(SqlSession sqlSession){
        sqlSession.commit();
        sqlSession.close();
    }
}
