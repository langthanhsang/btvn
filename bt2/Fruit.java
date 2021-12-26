package btvn.bt2;

public class Fruit {
    private  String kind;
    private double weight;
    private String taste;
    private double price;

    public Fruit() {
    }

    public Fruit(String kind, double weight, String taste, double price) {
        this.kind = kind;
        this.weight = weight;
        this.taste = taste;
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "kind='" + kind + '\'' +
                ", weight=" + weight +
                ", taste='" + taste + '\'' +
                ", price=" + price +
                '}';
    }
}
