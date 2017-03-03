package com.zuxia.entity;

import java.util.Date;

/**
 * Created by caitxj on 17-2-15.
 */
public class User {
    private Integer  id;

    private String name;

    private Date  time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
