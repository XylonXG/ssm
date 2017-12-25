package com.xg.serviceImpl;

import com.xg.entity.Goods;
import com.xg.mapper.GoodsMapper;
import com.xg.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public void addGoods(Goods goods) {
        goodsMapper.addGoods(goods);
    }

    @Override
    public List<Goods> selectAllGoods(Goods goods) {
        return goodsMapper.selectAllGoods(goods);
    }

    @Override
    public Goods selectGoodsById(int Gid) {
        return goodsMapper.selectGoodsById(Gid
        );
    }
    @Override
    public void deleteGoodsById(int id){
        goodsMapper.deleteGoodsById(id);
    }

}
