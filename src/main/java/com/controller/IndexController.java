package com.controller;

import com.entity.Goods;
import com.service.GoodsService;
import com.sun.corba.se.impl.oa.poa.POAPolicyMediatorImpl_NR_UDS;
import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class IndexController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("findAll")
    public ModelAndView findAll() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("goods", goodsService.findAll());
        return mav;
    }

    @RequestMapping("findOne")
    public ModelAndView findOne(Integer gid) {
        ModelAndView mav = new ModelAndView("MyJsp");
        mav.addObject("goodz", goodsService.findOne(gid));
        mav.addObject("typez", goodsService.findTypez());
        return mav;
    }

    @RequestMapping("addGood")
    public ModelAndView add(Goods goods,@RequestParam("pic") MultipartFile file, HttpServletRequest request) {
        if(file.getSize()>0){
            String path=request.getRealPath("/");
            String oleName=file.getOriginalFilename();
            String ext=oleName.substring(oleName.lastIndexOf("."));
            String newName= UUID.randomUUID().toString()+ext;
            File file1=new File(path+"/imgs/"+newName);
            file1.getParentFile().mkdirs();
            try {
                file.transferTo(file1);
                goods.setPicture(newName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ModelAndView mav=new ModelAndView("redirect:index");
        goodsService.addGood(goods);
        return mav;
    }
    @RequestMapping("updGood")
    public ModelAndView updGood(Goods goods,@RequestParam("pic") MultipartFile file, HttpServletRequest request){
        if(file.getSize()>0){
            String path=request.getRealPath("/");
            String oleName=file.getOriginalFilename();
            String ext=oleName.substring(oleName.lastIndexOf("."));
            String newName= UUID.randomUUID().toString()+ext;
            File file1=new File(path+"/imgs/"+newName);
            file1.getParentFile().mkdirs();
            try {
                file.transferTo(file1);
                goods.setPicture(newName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ModelAndView mav=new ModelAndView("redirect:index");
        goodsService.updGood(goods);
        return mav;
    }
    @RequestMapping("findTypez")
    public ModelAndView findTypez(){
        ModelAndView mav=new ModelAndView("MyJsp");
        mav.addObject("typez",goodsService.findTypez());
        return mav;
    }
    @RequestMapping("delGood")
    public ModelAndView delGood(Integer gid){
        ModelAndView mav=new ModelAndView("redirect:index");
        if(gid!=null){
            goodsService.delGood(gid);
        }
        return mav;
    }
}
