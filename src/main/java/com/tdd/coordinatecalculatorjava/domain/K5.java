package com.tdd.coordinatecalculatorjava.domain;

public class K5 implements Car {

    //    private final String name;
    private double tripDistance;
//    private final double distancePerLiter;

    public K5(double tripDistance) {
        this.tripDistance = tripDistance;
//        this.name = "Avante";
//        this.distancePerLiter = 15;
    }

    @Override
    public double getDistancePerLiter() {
        return 13;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
