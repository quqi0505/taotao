package com.itheima.controller;

import com.itheima.common.pojo.EasyUIPage;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ItemController {
    /**
     * 获取item的列表
     */
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIPage getItemList(Integer page,Integer rows){

        EasyUIPage result = itemService.getItemList(page,rows);
        return result;
    }
}
