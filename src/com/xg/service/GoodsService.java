package com.xg.service;

import com.xg.entity.Goods;

import java.util.List;

public interface GoodsService {
    public void addGoods(Goods goods);
    public List<Goods> selectAllGoods(Goods goods);
    public Goods selectGoodsById(int Gid);
    public void deleteGoodsById(int id);
}
