package btvn.bt2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerFruit {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Fruit> fruits = new ArrayList<>();

    public Fruit creatFruit() {
        System.out.println("nhập loại :");
        String kind = scanner.nextLine();
        System.out.println("nhập cân năng:");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhập vị:");
        String taste = scanner.nextLine();
        System.out.println("nhập giá:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        return new Fruit(kind, weight, taste, price);
    }

    public boolean addFruit(Fruit fruit) {
        return fruits.add(fruit);
    }

    public void displayAll() {
        for (Fruit f : fruits) {

            System.out.println(f);
        }
    }

    public ArrayList<Fruit> displayByKind(String kind) {
        ArrayList<Fruit> arrayList = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getKind().equals(kind)) {
                arrayList.add(fruit);
            }
        }
        for (Fruit f : arrayList) {
            System.out.println(f);
        }
        return arrayList;
    }

    public void displayKindOfFruitMax() {
       double max = fruits.get(0).getPrice();
        for (Fruit fruit: fruits) {
           if (max < fruit.getPrice()){
               max = fruit.getPrice();
           }
        }
        for (Fruit fruit: fruits) {
            if( max == fruit.getPrice()){
                System.out.println(fruit);
            }
        }
    }
    public void deleteBykind( String kind) {

        for (Fruit f: fruits) {
          if (f.getKind().equals(kind)) {
             fruits.remove(f) ;
          }
        }
    }
    public void canByAmostBy10k(){
        double min =fruits.get(0).getPrice();
        for (Fruit fruit: fruits) {
            if(min > fruit.getPrice()){
                min = fruit.getPrice();
                System.out.println("quả bạn có thể mua dc nhiều nhất là :  ");
            }
        }
    }
}
