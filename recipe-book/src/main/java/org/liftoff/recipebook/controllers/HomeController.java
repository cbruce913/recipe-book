package org.liftoff.recipebook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    @GetMapping
    public String index() {
        return "index";
    }

//    @GetMapping("CreateRecipe")
//    public String createRecipe() {
//        return "CreateRecipe";
//    }


}
