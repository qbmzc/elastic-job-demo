package com.cong.elasticjobdemo.temo;

import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
public class MyJob implements SimpleJob {

    @Override
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0:
                log.info("0");
                break;
            case 1:
                log.info("1");
                break;
            case 2:
                log.info("2");
                break;
            case 3:
                log.info("3");
                break;
            // case n: ...
            default:
                log.info("default");
                break;
        }
    }
}
