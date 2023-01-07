package com.css.scheduled;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledDemo {
    /*
     * 定时任务 类作为组件@Component交给spring容器管理
     * @Scheduled ：设置定时任务
     * cron：设置定时任务触发时间
     */
    @Scheduled(cron="0/10 * * * * ?")
    public void task()
    {
        System.out.println(LocalDateTime.now()+" 我是scheduler任务，10秒执行 一次");
    }
}
