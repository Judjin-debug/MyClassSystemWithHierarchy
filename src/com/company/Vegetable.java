package com.company;

import java.util.Objects;

abstract class Vegetable {

    double weightInGramms;
    double calorieAmount;

    public Vegetable (int weightInGramms) {
        if (weightInGramms <= 0) {
            this.weightInGramms = 0;
        } else {
            this.weightInGramms = weightInGramms;
        };

    };

    public double getWeightInGramms() {
        return weightInGramms;
    };

    public double getCalorieAmount() {
        return calorieAmount;
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return Double.compare(vegetable.calorieAmount, calorieAmount) == 0;
    };

    @Override
    public int hashCode() {
        return Objects.hash(calorieAmount);
    };

}
