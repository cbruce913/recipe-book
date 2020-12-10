package org.liftoff.recipebook.controllers;

import org.liftoff.recipebook.data.RecipeRepository;
import org.liftoff.recipebook.models.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class RecipeController {
    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("CreateRecipe")
    public String renderCreateRecipeForm(Model model){
        model.addAttribute(new Recipe());
        return "CreateRecipe";
    }

    @PostMapping("CreateRecipe")
    public String createRecipe(@RequestParam String name, Recipe recipe, @RequestParam String description){
        recipe.setName(name);
        recipe.setDescription(description);
    recipeRepository.save(recipe);
    return "redirect:";
    }
}
