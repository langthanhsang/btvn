package exam;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerLaptop {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Laptop> laptops = new ArrayList<>();

    public Laptop createLaptop() {
        System.out.println("nhập hãng :");
        String brand = scanner.nextLine();
        scanner.nextLine();
        System.out.println("nhập màu sắc :");
        String color = scanner.nextLine();
        System.out.println("nhập giá :");
        int price = scanner.nextInt();
        System.out.println("nhập số lượng :");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return new Laptop(brand, color, price, amount);
    }

    public boolean addLaptop(Laptop laptop) {
        return laptops.add(laptop);
    }

    public Laptop deleteById(int id) {
        Laptop laptop = null;
        for (Laptop l : laptops) {
            if (id == l.getId()) {
                laptop = l;
            }
        }
        if (laptop != null) {
            laptops.remove(laptop);
        }
        return laptop;
    }

    public void displayAll() {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    public ArrayList<Laptop> searchColor(String color) {
        ArrayList<Laptop> colorList = new ArrayList<>();

        for (Laptop l : laptops) {
            if (l.getColor().equals(color)) {
                colorList.add(l);
            }
        }
        for (Laptop laptop : colorList) {
            System.out.println(laptop);
        }
        return colorList;
    }

    public ArrayList<Laptop> searchLaptopByBrand(String brand) {
        ArrayList<Laptop> laptops1 = new ArrayList<>();
        Laptop laptop = null;
        for (Laptop l : laptops) {
            if (l.getBrand().equals(brand)) {
                laptops1.add(l);
            }
        }

        for (Laptop ll : laptops1) {
            System.out.println(ll);
        }
        return laptops1;
    }

    public ArrayList<Laptop> displaybByBrand(String brand) {
        ArrayList<Laptop> laptops2 = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getBrand().equals(brand)) {
                laptops2.add(laptop);
            }
        }
        for (Laptop l : laptops2) {
            System.out.println(l);
        }
        return laptops2;
    }

    public ArrayList<Laptop> rangePrice(int minPrice, int maxPrice) {
        boolean check = false;
        for (Laptop laptop : laptops) {
            if (minPrice <= laptop.getPrice() && laptop.getPrice() <= maxPrice) {
                System.out.println(laptop);
                check = true;
            }
        }
        if (!check) {
            System.out.println("trong khoảng giá đó không có laptop: ");
        }

        return null;
    }

    public Laptop updateLaptop(int id) {
        Laptop laptop = null;
        for (Laptop l : laptops) {
            if (id == l.getId()) {
                laptop = l;

            }
        }

        if (laptop != null) {
            int index = laptops.indexOf(laptop);
            System.out.println("nhập hãng mới: ");
            String brand = scanner.nextLine();
            scanner.nextLine();
            laptop.setBrand(brand);
            System.out.println("nhập màu mới : ");
            String color = scanner.nextLine();
            laptop.setColor(color);
            System.out.println("nhập giá mới : ");
            int price = scanner.nextInt();
            laptop.setPrice(price);
            System.out.println("nhâp số lượng mới : ");
            int amout = scanner.nextInt();
            laptop.setAmount(amout);
            laptops.set(index, laptop);

        }
        return laptop;
    }

    public void writeFile(File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (Laptop laptop : laptops) {
                oos.writeObject(laptop);
            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFile(File f) {
        try {

            InputStream is = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(is);
            Laptop laptop = null;
            while (true){
                Object oj = ois.readObject();
                if(oj == null){
                    break;
                }
                if (oj != null){
                    laptop = (Laptop) oj;
                    this.laptops.add(laptop);
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
