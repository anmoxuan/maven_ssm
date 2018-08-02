package com.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Goods {
    private Integer gid;
    private String gname;
    private double price;
    private String picture;
    private Date yieldtime;
    private Typez typez;

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", yieldtime=" + yieldtime +
                ", typez=" + typez +
                '}';
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getYieldtime() {
        return yieldtime;
    }

    public void setYieldtime(Date yieldtime) {
        this.yieldtime = yieldtime;
    }

    public Typez getTypez() {
        return typez;
    }

    public void setTypez(Typez typez) {
        this.typez = typez;
    }
}
