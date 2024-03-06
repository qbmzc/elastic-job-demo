package com.cong.elasticjobdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("http/job")
public class HttpJobController {
    
    @PostMapping("add")
    public void add(){
        
    }
}
