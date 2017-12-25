package com.xg.entity;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    private int id;
    private String goodsName;
    private double goodsPrice;
    private String goodsCreateTime;
    private String goodsPath;
    private String goodsHttp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsCreateTime() {
        return goodsCreateTime;
    }

    public void setGoodsCreateTime(String goodsCreateTime) {
        this.goodsCreateTime = goodsCreateTime;
    }

    public String getGoodsPath() {
        return goodsPath;
    }

    public void setGoodsPath(String goodsPath) {
        this.goodsPath = goodsPath;
    }

    public String getGoodsHttp() {
        return goodsHttp;
    }

    public void setGoodsHttp(String goodsHttp) {
        this.goodsHttp = goodsHttp;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsCreateTime='" + goodsCreateTime + '\'' +
                ", goodsPath='" + goodsPath + '\'' +
                ", goodsHttp='" + goodsHttp + '\'' +
                '}';
    }
}
