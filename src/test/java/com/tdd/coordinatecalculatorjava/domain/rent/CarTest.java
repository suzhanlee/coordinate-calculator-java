package com.tdd.coordinatecalculatorjava.domain.rent;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new K5(130);
    }

    @Test
    void getDistancePerLiter() {
        assertThat(car.getDistancePerLiter()).isEqualTo(13);
    }

    @Test
    void getTripDistance() {
        assertThat(car.getTripDistance()).isEqualTo(130);
    }

    @Test
    void getName() {
        assertThat(car.getName()).isEqualTo("K5");
    }

    @Test
    void getChargeQuantity() {
        assertThat(car.getChargeQuantity()).isEqualTo(10);
    }
}