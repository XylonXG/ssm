package com.xg.mapper;

import com.xg.entity.Goods;

import java.util.List;

public interface GoodsMapper {
    public void addGoods(Goods goods);
    public List<Goods> selectAllGoods(Goods goods);
    public Goods selectGoodsById(int Gid);
    public void deleteGoodsById(int id);
}
