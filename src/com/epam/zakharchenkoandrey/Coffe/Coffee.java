package com.epam.zakharchenkoandrey.Coffe;

import java.util.List;

public abstract class Coffee {

    protected List<Object> listIngredient;

    @Override
    public String toString() {
        return "Your coffee contains " + listIngredient;
    }
}
