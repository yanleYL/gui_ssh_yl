package com.itheima.dao;

import com.itheima.domain.Items;
import org.springframework.stereotype.Repository;

/**
 * Project:maven_day01
 * Package: com.itheima.dao
 * Author: yanle
 * Date: 2018/12/18
 * Version: 1.0
 * Time:19:46
 */
@Repository
public interface ItemsDao {

    //根据id查询用户对象
    Items findItemById(Integer itemId);
}
