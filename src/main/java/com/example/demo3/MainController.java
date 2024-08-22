package com.example.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/wel")
    @ResponseBody
    public String  controllerMethod(){
        return "welcome to my first spring boot application ";
    }
}
