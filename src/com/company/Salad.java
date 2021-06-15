package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Salad {

    List<Vegetable> salad = new ArrayList<Vegetable>();


    public double getCalories () {

        Iterator iter = this.salad.iterator();

        double result = 0d;
        Vegetable token;

        while (iter.hasNext()) {
            token = (Vegetable) iter.next();
            result += token.getCalorieAmount();
        };

        return result;

    };

    public void vegetableSortByCalorieAmount () {
        this.salad.sort((a, b) -> (int) (a.getCalorieAmount() - b.getCalorieAmount()));
    };

    public void vegetableFindByCalories (int min, int max) {


        Iterator iter = this.salad.iterator();

        Vegetable token;

        while (iter.hasNext()) {
            token = (Vegetable) iter.next();
            if (token.getCalorieAmount() >= min && token.getCalorieAmount() <= max) {
                System.out.println(token.toString());
            };
        };

    };

    public void showVegetablesInSalad () {


        Iterator iter = this.salad.iterator();

        Vegetable token;

        while (iter.hasNext()) {
            token = (Vegetable) iter.next();
            System.out.println(token.toString());
        };

    };

    public void saladAdd (Vegetable vegetable) {
        this.salad.add(vegetable);
    };


};
