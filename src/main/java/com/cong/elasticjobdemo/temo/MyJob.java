package com.cong.elasticjobdemo.temo;

import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.springframework.stereotype.Component;

@Component
public class MyJob implements SimpleJob {

    @Override
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0:
                System.out.println("a");
                break;
            case 1:
                System.out.println("b");
                break;
            case 2:
                System.out.println("c");
                break;
            case 3:
                System.out.println("d");
                break;
            // case n: ...
            default:
                System.out.println("aaa");
        }
    }
}
