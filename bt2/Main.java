package btvn.bt2;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerFruit managerFruit = new ManagerFruit();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println(":*********MENU**********");
            System.out.println("1. thêm 1 loại quả :");
            System.out.println("2.hiển thị tất cả: ");
            System.out.println("3.hiển thị theo loại :");
            System.out.println("4. quả có giá cao nhất");
            System.out.println("5. niếu có 10k thì mua gì dc nhiều nhất");
            System.out.println("6. xoá 1 qủa khỏi danh sách");
            System.out.println("nhập sự lựa chọn cửa bạn!");

            choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("thêm loai quả bạn muốn");
                    Fruit fruit = managerFruit.creatFruit();
                    if (managerFruit.addFruit(fruit)) {
                        System.out.println("thêm thành công");
                    } else {
                        System.out.println("thêm không thành công");
                    }
                    break;
                case 2:
                    System.out.println("tất cả loai quả:");
                    managerFruit.displayAll();
                    break;
                case 3:
                    System.out.println("nhập loại quả muốn hiển thị: ");
                    String kind = scanner.nextLine();
                    managerFruit.displayByKind(kind);
                    break;

                case 4:
                    System.out.println("quả có giá cao nhất là: ");
                    managerFruit.displayKindOfFruitMax();
                    break;
                case 5:

                    System.out.println("nhập loại quả bạn muốn xoá :");
                    String kind1 = scanner.nextLine();
                    managerFruit.deleteBykind(kind1);
                    break;
                case 6:
                    System.out.println("bạn có thể mua dc nhiều nhất loại quả là:");
                    managerFruit.canByAmostBy10k();
                    break;
            }
        } while (choice != 0);
    }
}
