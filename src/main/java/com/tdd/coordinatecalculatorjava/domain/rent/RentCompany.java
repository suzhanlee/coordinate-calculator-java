package com.tdd.coordinatecalculatorjava.domain.rent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {

    private List<Car> cars;

    public static RentCompany create() {
        RentCompany rentCompany = new RentCompany();
        rentCompany.cars = new ArrayList<>();
        return rentCompany;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        List<Double> chargeQuantityList = cars.stream().map(Car::getChargeQuantity).collect(
            Collectors.toList());

        StringBuilder report = new StringBuilder();

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            double doubleChargeQuantity = chargeQuantityList.get(i);
            int chargeQuantity = (int) doubleChargeQuantity;
            report.append(car.getName()).append(" : ")
                .append(chargeQuantity).append("리터")
                .append('\n')
                .append(" ");


        }

        return report.toString();
    }
}
