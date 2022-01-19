package com.firstapp.dao.model;

import java.util.Date;

public class Employee extends BaseEntity {
    private Long id;

    private String name;

    private Date birthday;

    private Date joindate;

    private String employeefrom;

    private Date rowupdatetime;

    private Date curcreatetime;

    public Employee(Long id, String name, Date birthday, Date joindate, String employeefrom, Date rowupdatetime, Date curcreatetime) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.joindate = joindate;
        this.employeefrom = employeefrom;
        this.rowupdatetime = rowupdatetime;
        this.curcreatetime = curcreatetime;
    }

    public Employee() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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