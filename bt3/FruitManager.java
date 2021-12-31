package btvn.bt3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;

public class FruitManager {
    private ArrayList<Fruit> fruits = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public Fruit createFruit(int choice) {
        System.out.println("nhập cân nặng ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhâp vị: ");
        String taste = scanner.nextLine();
        System.out.println("nhập màu sắc");
        String color = scanner.nextLine();
        System.out.println("nhập giá :");
        double price = scanner.nextDouble();
        scanner.nextLine();
        if (choice == 1) {
            return new Apple(weight, taste, color, price);
        } else if (choice == 2) {
            return new Banana(weight, taste, color, price);
        } else if (choice == 3) {
            return new Lemon(weight, taste, color, price);
        }
        return null;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void displayAll() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public void displayApple() {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                System.out.println(fruit);
            }
        }
    }

    public void displayBanana() {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Banana) {
                System.out.println(fruit);
            }
        }
    }

    public void displayLemon() {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Lemon) {
                System.out.println(fruit);
            }
        }
    }

    public ArrayList<Fruit> deleteByPrice(double price) {
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (price == fruit.getPrice()) {
                fruitArrayList.add(fruit);
            }
        }
        return fruitArrayList;
    }

    public void displayMaxPrice() {
        double maxPrice = fruits.get(0).getPrice();
        for (Fruit fruit : fruits) {
            if (maxPrice < fruit.getPrice()) {
                maxPrice = fruit.getPrice();
            }
        }
        for (Fruit fruit : fruits) {
            if (fruit.getPrice() == maxPrice) {
                System.out.println(fruit);
            }
        }
    }
    public void displayMinPrice() {
        double minPrice = fruits.get(0).getPrice();
        for (Fruit fruit : fruits) {
            if (minPrice > fruit.getPrice()) {
                minPrice = fruit.getPrice();
            }
        }
        for (Fruit fruit : fruits) {
            if (fruit.getPrice() == minPrice) {
                System.out.println(fruit);
            }
        }
    }
    public void exportCvs(){

        try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format("/Volumes/WorkSpace/Codegym/ArrayList/src/btvn/bt3",new Date().getTime())))){
            StringBuilder sb = new StringBuilder();
            sb.append("weight");
            sb.append("vị");
            sb.append("Màu");
            sb.append("giá");

            if( fruits.size() > 0){
                for (Fruit fruit: fruits) {
                    sb.append(fruit.getWeight());
                    sb.append(',');
                    sb.append(fruit.getTaste());
                    sb.append(',');
                    sb.append(fruit.getColor());
                    sb.append(',');
                    sb.append(fruit.getPrice());
                    sb.append('\n');

                }
            }
            bufferedWriter.write(sb.toString());
            System.out.println("write successfully");
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }

}
