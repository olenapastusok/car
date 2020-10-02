package com.company;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class CarService {

    public static List<Car> getCarsByBrand(List<Car> cars, String brand) {
        List<Car> carsByBrand = new ArrayList<>();
        for (Car car : cars) {
            if (Objects.equals(car.getBrand(), brand)) {
                carsByBrand.add(car);
            }
        }        return carsByBrand;
    }

    public static List<Car> getCarsByBrandAndCarAge(List<Car> cars, String brand, int carAge) {
        List<Car> carsByBrand = getCarsByBrand(cars, brand);
        List<Car> carsByBrandAndCarAge = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (Car car : carsByBrand) {
            if (currentYear - car.getYear() > carAge) {
                carsByBrandAndCarAge.add(car);
            }
        }
        return carsByBrandAndCarAge;
    }

    public static List<Car> getCarsByYearAndPrice(List<Car> cars, int year, float price) {
        List<Car> carsByYearAndPrice = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() == year) {
                if (car.getPrice() > price) {
                    carsByYearAndPrice.add(car);
                }
            }
        }
        return carsByYearAndPrice;
    }
}