package lesson.spel;

/**
 * Created by ray.liu on 2016/4/25.
 */
public class Car {
    private String brand;
    private double price;
    private double tyrePrimeter;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTyrePrimeter() {
        return tyrePrimeter;
    }

    public void setTyrePrimeter(double tyrePrimeter) {
        this.tyrePrimeter = tyrePrimeter;
    }

    public Car() {
        System.out.println("Car's constructor");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", tyrePrimeter=" + tyrePrimeter +
                '}';
    }
}
