package com.leaning.firstweek.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HellorWorldController {
    @RequestMapping("/getServerTime")
    public String getServerTime(){
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return String.format("Hellor world %s, first java application ,当前时间是 %s","!",sdf.format(d)) ;
    }
    /*
    * Hellor world !, first java application ,当前时间是 2022-01-16 09:36:07
    * */


}
