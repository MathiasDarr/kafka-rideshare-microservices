package org.mddarr.oath2authorizer.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hell")
    public String hello(){
        return "hello";
    }




}
