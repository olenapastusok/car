public class Car {

    private final int id;
    private final String brand;
    private final String model;
    private final int year;
    private final String color;
    private final float price;
    private final String serialNumber;

    public Car(int id, String brand, String model, int year, String color, float price, String serialNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}