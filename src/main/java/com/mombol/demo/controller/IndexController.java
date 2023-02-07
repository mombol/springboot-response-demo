package com.mombol.demo.controller;

import com.mombol.demo.response.ResponseBodyEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/hello")
    public ResponseBodyEntity hello(@RequestParam(value = "name", required = false) String name) {
        return ResponseBodyEntity.success("hello " + name);
    }

}
