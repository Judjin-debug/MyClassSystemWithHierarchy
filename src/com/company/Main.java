package com.company;

public class Main {

    public static void main(String[] args) {
	    Salad salad = new Salad();

	    Tomato tomato = new Tomato(80);
	    Olive olive = new Olive(5);
	    Lettuce lettuce = new Lettuce(24);

	    salad.saladAdd(tomato);
	    salad.saladAdd(olive);
	    salad.saladAdd(lettuce);

        salad.showVegetablesInSalad();
		System.out.println();

        salad.vegetableSortByCalorieAmount();

        salad.showVegetablesInSalad();
		System.out.println();

        salad.vegetableFindByCalories(5, 10);

    }


}
