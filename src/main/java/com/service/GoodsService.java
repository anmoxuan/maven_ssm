package com.service;

import com.entity.Goods;
import com.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    public List findAll(){
        return goodsMapper.findGoods();
    }
    public Goods findOne(Integer gid){
        return goodsMapper.findOne(gid);
    }
    @Transactional
    public int addGood(Goods goods){
        return goodsMapper.addGoods(goods);
    }
    @Transactional
    public int updGood(Goods goods){
        return goodsMapper.updGoods(goods);
    }
    @Transactional
    public int delGood(Integer gid){
        return goodsMapper.delGoods(gid);
    }
    public List findTypez(){
        return goodsMapper.findTypez();
    }
}
