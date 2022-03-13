package com.example.springaop;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class AopController {
    private final Logger log = LogManager.getLogger(AopController.class);
    @Resource
    private final AopService aopService;

    public AopController(AopService aopService) {
        this.aopService = aopService;
    }

    @GetMapping("/foo")
    public String foo() {
        log.info("============\tcontroller foo");
        return aopService.foo();
    }
}
