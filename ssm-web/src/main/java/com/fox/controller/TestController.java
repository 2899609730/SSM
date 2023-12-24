package com.fox.controller;

import com.fox.domain.Test;
import com.fox.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/findAllTest")
    public List<Test> findAllTest() {
        return testService.findAll();
    }
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
