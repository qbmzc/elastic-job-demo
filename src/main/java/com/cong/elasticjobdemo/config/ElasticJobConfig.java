// package com.cong.elasticjobdemo.config;

// import org.apache.shardingsphere.elasticjob.api.JobConfiguration;
// import org.apache.shardingsphere.elasticjob.lite.api.bootstrap.impl.ScheduleJobBootstrap;
// import org.apache.shardingsphere.elasticjob.reg.base.CoordinatorRegistryCenter;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import com.cong.elasticjobdemo.service.FileService;

// /**
//  * elasticJob
//  */
// @Configuration
// public class ElasticJobConfig {

//     @Autowired
//     CoordinatorRegistryCenter registryCenter;

//     @Autowired
//     FileService fileService;

//     @Bean
//     public JobConfiguration createJobConfiguration() {

//         // 定义作业核心配置
//         JobConfiguration jobConfig = JobConfiguration.newBuilder("myJob", 3)
//                 .cron("0/5 * * * * ?")
//                 .shardingItemParameters("0=text,1=image,2=radio")
//                .failover(true)
//             .overwrite(true)
//             .monitorExecution(true)
//             .misfire(true).build();

//         //启动分布式定时任务
//         new ScheduleJobBootstrap(registryCenter, new FileBackupJobDb(fileService), jobConfig).schedule();
//         return jobConfig;
//     }
// }

