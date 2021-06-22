//package com.lagou.dao;
//
//import com.lagou.pojo.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
///**
// * @ClassName IUserDaoImpl
// * @Description TODO
// * @Author mao
// * @Data 2021/6/21 15:33
// **/
//public class IUserDaoImpl implements IUserDao {
//    @Override
//    public List<User> findAll() throws IOException {
//        //1.Resources工具类，配置文件的加载,把配置文件加载成字节输入流
//        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//
//        //2.解析了配置文件，并创建了sqlSessionFactory工厂
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        //3.生产sqlSession
//        SqlSession sqlSession = sqlSessionFactory.openSession();//默认开启一个事务，但事务不会自动提交
//        //4.sqlSession调用方法
//        List<User> users = sqlSession.selectList("user.findAll");
//        for (User user : users) {
//            System.out.println(user);
//        }
//        sqlSession.close();
//        return users;
//    }
//}
