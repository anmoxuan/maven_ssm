package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Typez {
    private Integer tid;
    private String tname;

    @Override
    public String toString() {
        return "Typez{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
