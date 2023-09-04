package com.tdd.coordinatecalculatorjava.domain.beverage;

public abstract class Beverage {

    public void prepareRecipe() {
        boilWater();
        brewIngredient();
        pourInCup();
        addIngredient();
    }

    protected abstract void addIngredient();

    private void pourInCup() {
        System.out.println("물을 붓는다");
    }

    protected abstract void brewIngredient();

    private void boilWater() {
        System.out.println("물을 끓인다");
    }


}
