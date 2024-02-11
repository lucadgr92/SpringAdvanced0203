package com.develhope.SpringAdvanced0203.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class BasicController {

    @Value("${myCustomVarTree.authCode}")
    String varOne;

    @Value("${myCustomVarTree.devName}")
    String varTwo;


    @GetMapping("/show/ymlproperties")
    public @ResponseBody String showYmlProperties() {


        return "Hello! " + varTwo + " " + varOne;

    }
}


/*

        define an application.yaml config file where you set:
        a property called authCode with the value xyz458
        a property called devName with your name as a value
        using Spring Boot on port 4500, return a greeting message showing the devName and the authCode using the getProperty method
*/
