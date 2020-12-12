package org.liftoff.recipebook.controllers;

import org.liftoff.recipebook.data.RecipeCategoryRepository;
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

    @Autowired
    private RecipeCategoryRepository recipeCategoryRepository;

    @GetMapping("CreateRecipe")
    public String renderCreateRecipeForm(Model model){
        model.addAttribute(new Recipe());
        model.addAttribute("categories", recipeCategoryRepository.findAll());
        return "CreateRecipe";
    }

    @PostMapping("CreateRecipe")
    public String createRecipe(@RequestParam String name, Recipe recipe, @RequestParam String description,
                               @RequestParam String ingredient1, @RequestParam String ingredient2,
                               @RequestParam String ingredient3, @RequestParam String ingredient4,
                               @RequestParam String ingredient5, @RequestParam String category){
        String ingredients = "";
        if(ingredient1.length() > 0){ ingredients += ingredient1 +",";}
        if(ingredient2.length() > 0){ ingredients += ingredient2 +",";}
        if(ingredient3.length() > 0){ ingredients += ingredient3 +",";}
        if(ingredient4.length() > 0){ ingredients += ingredient4 +",";}
        if(ingredient5.length() > 0){ ingredients += ingredient5 +",";}
        ingredients.trim();
        recipe.setName(name);
        recipe.setDescription(description);
        recipe.setIngredients(ingredients);
        recipe.setCategory(category);
    recipeRepository.save(recipe);
    return "redirect:";
    }
}
