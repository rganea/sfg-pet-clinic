package com.example.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner") //prefixing at the class level for all request mappings
@Controller
public class OwnerController {

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listVets(){
        return "owner/index";
    }
}
