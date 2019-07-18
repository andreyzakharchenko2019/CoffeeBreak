package com.epam.zakharchenkoandrey.Coffe;

import com.epam.zakharchenkoandrey.Ingredient;

import java.util.ArrayList;

public class Doppio extends Espresso {

    public Doppio() {

        listIngredient.add(Ingredient.ARABICA);
        listIngredient.add(Ingredient.ROBUSTA);
        listIngredient.add(Ingredient.SUGAR);
    }
}
