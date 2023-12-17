package com.lmj.service.job;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

@Component
public class TestXxlJob {


    @XxlJob("test1")
    public void test1(){
        XxlJobHelper.log("XXL-JOB, Hello World.");
        System.out.println("测试定时任务执行了");
    }
}
