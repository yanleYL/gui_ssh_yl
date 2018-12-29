package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project:maven_day01
 * Package: com.itheima.controller
 * Author: yanle
 * Date: 2018/12/18
 * Version: 1.0
 * Time:19:48
 */
@Controller
public class ItemsController {

    //注入service
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findItemsById")
    public String findItemsById(Integer itemId , Model model){
        Items item = itemsService.findItemById(itemId);
        model.addAttribute("item",item);
        return "item";
    }
}
