package com.itheima.test;

import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project:maven_day01
 * Package: com.itheima.test
 * Author: yanle
 * Date: 2018/12/18
 * Version: 1.0
 * Time:22:01
 */
public class TestSpringDemo {


    @Test
    public void findItemById(){
        //1.获取容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean-service.xml");
        //2.获取service
        ItemsService itemsService = applicationContext.getBean(ItemsService.class);
        System.out.println(itemsService.findItemById(2));

    }
}
