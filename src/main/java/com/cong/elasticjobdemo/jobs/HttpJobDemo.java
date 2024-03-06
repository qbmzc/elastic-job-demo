package com.cong.elasticjobdemo.jobs;

import javax.annotation.Resource;

import org.apache.shardingsphere.elasticjob.api.JobConfiguration;
import org.apache.shardingsphere.elasticjob.http.props.HttpJobProperties;
import org.apache.shardingsphere.elasticjob.lite.api.bootstrap.impl.ScheduleJobBootstrap;
import org.apache.shardingsphere.elasticjob.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.var;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HttpJobDemo {

    @Resource
    private ZookeeperRegistryCenter zookeeperRegistryCenter;

    @Bean
    public void task() {
        JobConfiguration jobConfiguration = JobConfiguration.newBuilder("javaHttpJob", 1)
                .setProperty(HttpJobProperties.URI_KEY, "http://192.168.70.58:8080/job/test")
                .setProperty(HttpJobProperties.METHOD_KEY, "GET")
                .setProperty(HttpJobProperties.DATA_KEY, "source=ejob")
                .setProperty(HttpJobProperties.READ_TIMEOUT_KEY, "120000")
                .setProperty(HttpJobProperties.CONNECT_TIMEOUT_KEY, "60000")
                .cron("0/15 * * * * ? *")
                .shardingItemParameters("0=test0,1=test1, 2=test2, 3=test3")
                .failover(true)
                .misfire(true)
                .overwrite(true)
                .build();

        ScheduleJobBootstrap scheduleJobBootstrap = new ScheduleJobBootstrap(zookeeperRegistryCenter, "HTTP",
                jobConfiguration);
        scheduleJobBootstrap.schedule();

    }
}
