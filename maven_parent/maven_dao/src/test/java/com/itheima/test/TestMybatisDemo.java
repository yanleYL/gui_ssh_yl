package com.itheima.test;

import com.itheima.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project:maven_day01
 * Package: com.itheima.test
 * Author: yanle
 * Date: 2018/12/18
 * Version: 1.0
 * Time:21:12
 */
public class TestMybatisDemo {

    @Test
    public void findItemById() {
        //1.获取容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean-dao.xml");

        //2.获取dao数据
        ItemsDao itemsDao = applicationContext.getBean(ItemsDao.class);
        System.out.println(itemsDao.findItemById(1));

    }
}
