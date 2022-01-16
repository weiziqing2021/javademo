package com.leaning.firstweek.Controller;

import com.alibaba.fastjson.JSON;
import com.leaning.firstweek.Models.EmployeeModel;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

@RestController()
@RequestMapping("/Employee")
public class EmployeeController {
    /*
     * 获取雇员列表*/
    @RequestMapping("/employees")
    public String getEmployees(){
        Date birthdate=Date.from(LocalDate.of(2002,01,16).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        Date joinDate=Date.from(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());

        List<EmployeeModel> list=new ArrayList<>();
        Calendar calendar=Calendar.getInstance();
        for (int i = 0; i < 10; i++) {
            EmployeeModel model=new EmployeeModel("张三", birthdate,joinDate,"智联");
            calendar.setTime(birthdate);
            calendar.add(Calendar.YEAR,-1);
            model.setBirthday(calendar.getTime());
            calendar.setTime(joinDate);
            calendar.add(Calendar.MONTH,-1);
            model.setJoinDate(calendar.getTime());

            list.add(model);
        }
        return JSON.toJSONString(list,true);
    }
    /*
    * 添加雇员 模拟post
    * @requestbody 注解吧json or params赋值给变量
    * */
    @RequestMapping(method = RequestMethod.POST,value = "/add")
    public String addEmployee(@RequestBody EmployeeModel model){
        return JSON.toJSONString(model,true);
    }



}
