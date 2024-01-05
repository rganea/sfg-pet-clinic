package com.example.sfgpetclinic.controllers;

import com.example.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners") //prefixing at the class level for all request mappings
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listOwners(Model model){ //spring MVC will inject the model
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
