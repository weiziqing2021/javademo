package com.firstapp.dao.model;

import com.firstapp.common.mybatis.model.BaseEntity;
import java.util.Date;

public class Employee extends BaseEntity {
    private String name;

    private Date birthday;

    private Date joindate;

    private String employeefrom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public String getEmployeefrom() {
        return employeefrom;
    }

    public void setEmployeefrom(String employeefrom) {
        this.employeefrom = employeefrom == null ? null : employeefrom.trim();
    }
}