package com.itheima.service;

import com.itheima.common.pojo.EasyUIPage;

public interface ItemService {

    EasyUIPage getItemList(Integer page,Integer rows);
}
