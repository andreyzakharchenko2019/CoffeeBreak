package com.epam.zakharchenkoandrey.Coffe;

import com.epam.zakharchenkoandrey.Ingredient;

import java.util.ArrayList;

public class Espresso extends Coffee {

    public Espresso() {

        listIngredient = new ArrayList<>();
        listIngredient.add(Ingredient.ARABICA);
        listIngredient.add(Ingredient.ROBUSTA);
    }
}
