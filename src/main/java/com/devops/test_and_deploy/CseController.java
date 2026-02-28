package com.devops.test_and_deploy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CseController {
    @GetMapping("/cseadd")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "This is 23MH1A05N0! Sum of " + String.valueOf(a) + " and " + String.valueOf(b)+ "is: " + String.valueOf(a + b);
    }
    
}
