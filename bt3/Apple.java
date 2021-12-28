package btvn.bt3;

public class Apple extends Fruit{
    public Apple() {
    }

    public Apple(double weight, String taste, String color, double price) {
        super(weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Apple" + super.toString();
    }
}
