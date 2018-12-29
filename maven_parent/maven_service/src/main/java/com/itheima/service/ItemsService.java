package com.itheima.service;

import com.itheima.domain.Items;

/**
 * Project:maven_day01
 * Package: com.itheima.service
 * Author: yanle
 * Date: 2018/12/18
 * Version: 1.0
 * Time:19:47
 */
public interface ItemsService {
    //通过id查询item
    public Items findItemById(Integer itemId);
}
