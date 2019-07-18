package com.epam.zakharchenkoandrey;

import com.epam.zakharchenkoandrey.Coffe.Coffee;

public class CupOfCoffee {

    private Coffee coffee;

    public CupOfCoffee () {

    }

    public CupOfCoffee (Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return "Here you are! " + coffee;
    }
}
