package com.mapper;

import com.entity.Goods;

import java.util.List;

public interface GoodsMapper {
    List findGoods();
    int addGoods(Goods goods);
    int updGoods(Goods goods);
    int delGoods(Integer gid);
    Goods findOne(Integer gid);
    List findTypez();
}
