import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "BMW", "X5", 2016, "black", 50000, "sn-1"));
        cars.add(new Car(2, "Toyota", "Raw-4", 2018, "black", 35000, "sn-2"));
        cars.add(new Car(3, "BMW", "X5", 2017, "red", 30000, "sn-3"));
        cars.add(new Car(4, "Mazda", "3", 2010, "green", 18000, "sn-4"));
        cars.add(new Car(5, "Niva", "4X4", 1999, "black", 60000, "sn-5"));
        cars.add(new Car(6, "BMW", "X6", 2019, "red", 300000, "sn-6"));


        System.out.println("All cars by brand : " + (CarService.getCarsByBrand(cars, "BMW")));

        System.out.println("All cars by brand and car age: " + (CarService.getCarsByBrandAndCarAge(cars, "BMW", 2)));

        System.out.println("All cars by year and price : " + (CarService.getCarsByYearAndPrice(cars, 2018, 10000)));
    }
}