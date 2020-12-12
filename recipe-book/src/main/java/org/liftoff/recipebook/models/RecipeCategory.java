package org.liftoff.recipebook.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RecipeCategory {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany
    private final List<Recipe> recipes = new ArrayList<>();


    public RecipeCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public RecipeCategory(String name) {
        this.name = name;
    }

    public RecipeCategory() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}
