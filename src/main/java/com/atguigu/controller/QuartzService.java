package com.atguigu.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Component
public class QuartzService {


    @Scheduled(cron = "0/5 * * * * ?")
    public void timerToNow(){
        System.out.println("定时开始");
        System.out.println("now time:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
