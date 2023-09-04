package com.tdd.coordinatecalculatorjava.domain.rent;

public class Sonata implements Car {

    //    private final String name;
    private double tripDistance;
//    private final double distancePerLiter;

    public Sonata(double tripDistance) {
        this.tripDistance = tripDistance;
//        this.name = "Avante";
//        this.distancePerLiter = 15;
    }

    @Override
    public double getDistancePerLiter() {
        return 10;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
