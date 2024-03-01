// package com.cong.elasticjobdemo.config;

// import org.apache.shardingsphere.elasticjob.reg.base.CoordinatorRegistryCenter;
// import org.apache.shardingsphere.elasticjob.reg.zookeeper.ZookeeperConfiguration;
// import org.apache.shardingsphere.elasticjob.reg.zookeeper.ZookeeperRegistryCenter;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class ZookeeperConfig {

//     //zookeeper链接字符串 localhost:2181
//     private  String ZOOKEEPER_CONNECTION_STRING = "localhost:2181" ;
//     //定时任务命名空间
//     private  String JOB_NAMESPACE = "elastic-job-boot-java";

//     //zk的配置及创建注册中心
//     @Bean(initMethod = "init")
//     public CoordinatorRegistryCenter setUpRegistryCenter(){
//         //zk的配置
//         ZookeeperConfiguration zookeeperConfiguration = new ZookeeperConfiguration(ZOOKEEPER_CONNECTION_STRING, "elastic-job-boot-java");
//         //设置zk超时时间
//         zookeeperConfiguration.setSessionTimeoutMilliseconds(1000);
//         //创建注册中心
//         CoordinatorRegistryCenter zookeeperRegistryCenter = new ZookeeperRegistryCenter(zookeeperConfiguration);
//         return zookeeperRegistryCenter;
//     }
// }


