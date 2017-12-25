package com.xg.controller;

import com.xg.entity.Goods;
import com.xg.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    @RequestMapping("/addGoods")
    public ModelAndView addGoods(String goodsName, double goodsPrice, String goodsCreateTime, MultipartFile goodsPhoto, HttpServletRequest request) throws Exception{
        ModelAndView mav=new ModelAndView();
        Goods goods=new Goods();

        if(goodsPhoto!=null){
            String oldName=goodsPhoto.getOriginalFilename();
            String newName= UUID.randomUUID()+oldName.substring(oldName.lastIndexOf("."));
            String goodsPath=request.getSession().getServletContext().getRealPath("/");
            /*图片的上传路径*/
            goodsPath=goodsPath+"/images/"+newName;
            System.out.println(goodsPath);
            /*图片显示的url*/
            String goodsHttp=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/images/"+newName;

            File file=new File(goodsPath);
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            goodsPhoto.transferTo(file);
            goods.setGoodsName(goodsName);
            SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");

            goods.setGoodsCreateTime(goodsCreateTime);
            goods.setGoodsPrice(goodsPrice);
            goods.setGoodsPath(goodsPath);
            goods.setGoodsHttp(goodsHttp);
            goodsService.addGoods(goods);
            System.out.println(goods);
            mav.getModel().put("goods",goods);

        }
        return new ModelAndView("forward:selectAllGoods.action");
    }

    /*查询商品*/
    @RequestMapping("/selectAllGoods")
    public ModelAndView selectAllGoods(Goods goods){
        ModelAndView mav=new ModelAndView();
        List<Goods> list=goodsService.selectAllGoods(goods);
        mav.getModel().put("list",list);
        mav.setViewName("showGoods.jsp");
        return mav;
    }

    /*查看商品详情*/
    @RequestMapping("/selectGoodsById")
    public ModelAndView selectGoodsById(int Gid){
        ModelAndView mav=new ModelAndView();
        Goods goods=goodsService.selectGoodsById(Gid);
        mav.getModel().put("goods",goods);
        mav.setViewName("goodsDetail.jsp");
        return mav;
    }

    /*删除商品*/
    @RequestMapping("/deleteGoodsById")
    public ModelAndView deleteGoodsById(int id){
        ModelAndView mav=new ModelAndView();
        goodsService.deleteGoodsById(id);
        return new ModelAndView("forward:selectAllGoods.action");
    }

}
