package com.tdd.coordinatecalculatorjava.domain.beverage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoffeeTest {

    private Beverage coffee;

    @BeforeEach
    void setUp() {
        coffee = new Coffee();
    }

    @Test
    @DisplayName("커피에 설탕과 우유를 넣는다.")
    void addIngredientTest(){
        coffee.addIngredient();
    }

    @Test
    @DisplayName("필터를 이용해 커피를 내린다.")
    void brewIngredientTest(){
        coffee.brewIngredient();
    }

    @Test
    @DisplayName("커피를 만든다.")
    void prepareRecipeTest(){
        coffee.prepareRecipe();
    }

}