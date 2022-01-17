package com.leaning.firstweek.viewmodels;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class EmployeeModel {


    public  long id;
    //雇员姓名
    private  String name;
    @JSONField(format = "yyyy-MM-dd")
    //雇员生日
    private Date birthday;
    @JSONField(format = "yyyy-MM-dd")
    //雇员加入日期
    private Date joinDate;
    //雇员求职信息从哪里来
    private String employeeFrom;

    /*
    * 唯一号*/
    public long getId() {
        return id;
    }
    /*唯一号*/
    public void setId(long id) {
        this.id = id;
    }

    /*雇员姓名*/
    public String getName() {
        return name;
    }


    /*雇员姓名*/
    public void setName(String name) {
        this.name = name;
    }
    /*雇员生日*/
    public Date getBirthday() {
        return birthday;
    }
    /*雇员生日*/
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    /*雇员加入日期*/
    public Date getJoinDate() {
        return joinDate;
    }
    /*雇员加入日期*/
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    /*雇员求职信息从哪里来*/
    public String getEmployeeFrom() {
        return employeeFrom;
    }
    /*雇员求职信息从哪里来*/
    public void setEmployeeFrom(String employeeFrom) {
        this.employeeFrom = employeeFrom;
    }

    public EmployeeModel(String name, Date birthday, Date joinDate, String employeeFrom) {
        this.name = name;
        this.birthday = birthday;
        this.joinDate = joinDate;
        this.employeeFrom = employeeFrom;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", joinDate=" + joinDate +
                ", employeeFrom='" + employeeFrom + '\'' +
                '}';
    }
}
