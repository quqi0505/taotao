package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.common.pojo.EasyUIPage;
import com.itheima.mapper.TbItemMapper;
import com.itheima.pojo.TbItem;
import com.itheima.pojo.TbItemExample;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public EasyUIPage getItemList(Integer page, Integer rows) {

//        开始分页
        PageHelper.startPage(page,rows);
//        查询所有的item
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
//      获取商品详情
        PageInfo info = new PageInfo(list);
        EasyUIPage result = new EasyUIPage();
        result.setTotal(info.getTotal());
        result.setRows(list);

        return result;
    }
}
