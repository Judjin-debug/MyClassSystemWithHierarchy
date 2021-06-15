package com.company;

public class Olive extends Vegetable {

    final int calorieAmountPer100g = 115;

    public Olive (int weightInGramms) {
        super(weightInGramms);
        this.calorieAmount = Math.round (( (double) calorieAmountPer100g / 100) * weightInGramms * 1000) / 1000d;
    };

    public int getCalorieAmountPer100g() {
        return calorieAmountPer100g;
    };

    @Override
    public String toString() {
        return "Olive{" +
                "calorieAmountPer100g=" + calorieAmountPer100g +
                ", weightInGramms=" + weightInGramms +
                ", calorieAmount=" + calorieAmount +
                '}';
    }
}