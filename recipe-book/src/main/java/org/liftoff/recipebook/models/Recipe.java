package org.liftoff.recipebook.models;

import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String description;
    private ArrayList<String> ingredients;
    private String category;

    public Recipe(){id++;}
    public Recipe(String name,String description,ArrayList<String> ingredients,String category){
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.category = category;
        id++;
    }

    public Recipe(String name){ this.name = name; id++;;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
