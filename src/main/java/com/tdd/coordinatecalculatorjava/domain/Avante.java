package com.tdd.coordinatecalculatorjava.domain;

public class Avante implements Car {

//    private final String name;
    private double tripDistance;
//    private final double distancePerLiter;

    public Avante(double tripDistance) {
        this.tripDistance = tripDistance;
//        this.name = "Avante";
//        this.distancePerLiter = 15;
    }

    @Override
    public double getDistancePerLiter() {
        return 15;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return "Avante";
    }
}
