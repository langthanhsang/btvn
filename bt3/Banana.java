package btvn.bt3;

public class Banana extends Fruit{
    public Banana() {
    }

    public Banana(double weight, String taste, String color, double price) {
        super(weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Banana{}"+ super.toString();
    }
}
