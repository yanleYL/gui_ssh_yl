package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project:maven_day01
 * Package: com.itheima.service.impl
 * Author: yanle
 * Date: 2018/12/18
 * Version: 1.0
 * Time:20:55
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    //注入dao
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public Items findItemById(Integer itemId) {

        return  itemsDao. findItemById(itemId);
    }
}
