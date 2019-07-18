package com.epam.zakharchenkoandrey;

import com.epam.zakharchenkoandrey.Coffe.Coffee;
import com.epam.zakharchenkoandrey.Coffe.Doppio;
import com.epam.zakharchenkoandrey.Coffe.Espresso;
import com.epam.zakharchenkoandrey.Coffe.VienneseCoffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String[] coffee = {"Espresso", "Doppio", "VienneseCoffee"};

    public static void main(String[] args) throws IOException {

        System.out.println("Would you like some coffee? (y / n)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        if (reader.readLine().equals("y")) {
            System.out.println("Choose your preferred drink: (1 - 3)");
            for (int i = 0; i < coffee.length; i++) {
                System.out.println(i + 1 + ". " + coffee[i]);
            }
            CupOfCoffee cupOfCoffee = createCapOfCoffee(Integer.parseInt(reader.readLine()));
            System.out.println(cupOfCoffee);
        } else {
            System.out.println("See you soon!");
        }
    }

    private static CupOfCoffee createCapOfCoffee(int numberOfCoffee) {

        Coffee currentCoffee;

        switch (numberOfCoffee) {
            case 1:
                currentCoffee = new Espresso();
                break;
            case 2:
                currentCoffee = new Doppio();
                break;
            case 3:
                currentCoffee = new VienneseCoffee();
                break;
            default:
                currentCoffee = new Espresso();
                break;
        }

        return new CupOfCoffee(currentCoffee);
    }
}
