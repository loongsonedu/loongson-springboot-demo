package com.css.quartz;

import java.time.LocalDateTime;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.css.service.UserService;

public class JobTask  implements Job{

    @Autowired
    private  UserService userService;
    
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
         //System.out.println(LocalDateTime.now()+" 我是一个quartz任务 。。。");
        userService.jobTask();
    }

}
