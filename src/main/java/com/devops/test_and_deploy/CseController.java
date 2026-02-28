package com.devops.test_and_deploy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CseController {
    @GetMapping("/cseadd")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
    
}
