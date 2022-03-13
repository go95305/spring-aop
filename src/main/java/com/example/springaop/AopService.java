package com.example.springaop;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class AopService {
    private final Logger log = LogManager.getLogger(AopService.class);
    public String foo() {
        log.info("============\tAopService foo");
        return "foo";
    }
}
