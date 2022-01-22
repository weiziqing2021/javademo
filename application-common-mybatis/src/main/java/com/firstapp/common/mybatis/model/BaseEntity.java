package com.firstapp.common.mybatis.model;

import java.util.Date;

public class BaseEntity {
    private Long id;
    private Date rowupdatetime;
    private Date curcreatetime;
    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRowupdatetime() {
        return rowupdatetime;
    }

    public void setRowupdatetime(Date rowupdatetime) {
        this.rowupdatetime = rowupdatetime;
    }

    public Date getCurcreatetime() {
        return curcreatetime;
    }

    public void setCurcreatetime(Date curcreatetime) {
        this.curcreatetime = curcreatetime;
    }
}
