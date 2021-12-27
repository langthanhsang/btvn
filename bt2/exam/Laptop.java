package exam;

import java.io.Serializable;

public class Laptop implements Serializable {
    private static int VALUE = 1;
    private  int id;
    private String brand;
    private String color;
    private int price;
    private int amount;

    public Laptop() {
    }

    public Laptop( String brand, String color, int price, int amount) {
        this.id = ++VALUE;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.amount = amount;
    }

    public static int getVALUE() {
        return VALUE;
    }

    public static void setVALUE(int VALUE) {
        Laptop.VALUE = VALUE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
