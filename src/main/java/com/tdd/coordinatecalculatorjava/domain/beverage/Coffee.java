package com.tdd.coordinatecalculatorjava.domain.beverage;

public class Coffee extends Beverage{

    @Override
    protected void addIngredient() {
        System.out.println("설탕과 우유를 넣는다.");
    }

    @Override
    protected void brewIngredient() {
        System.out.println("필터를 이용해 커피를 내린다.");
    }
}
