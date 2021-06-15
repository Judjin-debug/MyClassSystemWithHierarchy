package com.company;

public class Tomato extends Vegetable {

    final int calorieAmountPer100g = 18;

    public Tomato (int weightInGramms) {
        super(weightInGramms);
        this.calorieAmount = Math.round (( (double) calorieAmountPer100g / 100) * weightInGramms * 1000) / 1000d ;
    };

    public int getCalorieAmountPer100g() {
        return calorieAmountPer100g;
    };

    @Override
    public String toString() {
        return "Tomato{" +
                "calorieAmountPer100g=" + calorieAmountPer100g +
                ", weightInGramms=" + weightInGramms +
                ", calorieAmount=" + calorieAmount +
                '}';
    };
}
