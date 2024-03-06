package com.cong.elasticjobdemo.pojo;

import lombok.Data;

@Data
public class HttpJob {
    
    private String name;

    private String description;

    private String cron;

    private String url;

    private String method;

    private Boolean overwrite;

    private Boolean failover;
}
