package com.didispace.task;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Created by zhudonghong123 on 2017/12/13.
 * Spring Boot中使用@Scheduled创建定时任务
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

  /*  @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }*/

}