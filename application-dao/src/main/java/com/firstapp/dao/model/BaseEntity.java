package com.firstapp.dao.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 父类实体，每个表需要的列
 * */
public class BaseEntity {
    private long id;
    private Date curCreateTime;
    private Timestamp rowUpdateTime;
    public BaseEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCurCreateTime() {
        return curCreateTime;
    }

    public void setCurCreateTime(Date curCreateTime) {
        this.curCreateTime = curCreateTime;
    }

    public Timestamp getRowUpdateTime() {
        return rowUpdateTime;
    }

    public void setRowUpdateTime(Timestamp rowUpdateTime) {
        this.rowUpdateTime = rowUpdateTime;
    }
}
