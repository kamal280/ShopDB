package com.shoprk.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class DefaultConroller {

    @GetMapping("/")
    public String defaultView(Map<String,String> parameteres){

        parameteres.put("test1","Sample Title");
        return "index";
    }
}
