package btvn.exam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerLaptop managerLatop = new ManagerLaptop();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("********MENU***********");
            System.out.println("1.thêm một sản phẩm theo : ");
            System.out.println("2.sửa 1 sản phẩm theo id :");
            System.out.println("3.xoá 1 sản phẩm theo id :");
            System.out.println("4. hiển thị tất cả sản phẩm :");
            System.out.println("5.hiển thị tất cả sản phẩm theo hãng :");
            System.out.println("6.tìm kiếm một sản phẩm trong khoảng giá: ");
            System.out.println("7. tìm kiếm sản phẩm theo hãng :");
            System.out.println("8.tìm kiểm sản phẩm theo màu sắc :");
            System.out.println("9.ghi dữ liệu xuống file");
            System.out.println("10 docj dữ liệu từ file");
            System.out.println("0.exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("1.thêm một sản phẩm theo : ");
                    Laptop laptop = managerLatop.createLaptop();
                    if (managerLatop.addLaptop(laptop)) {
                        System.out.println("thêm thành công!");
                    } else {
                        System.out.println("thêm không thành công!");
                    }
                    break;
                case 2:
                    System.out.println("2.sửa 1 sản phẩm theo id :");
                    int editId = scanner.nextInt();
                    Laptop laptopUpdate = managerLatop.updateLaptop(editId);
                    if (laptopUpdate != null) {
                        System.out.println("sửa thành công !");
                        System.out.println(laptopUpdate);
                    } else {
                        System.out.println("sửa không thành công!");
                    }

                    break;
                case 3:
                    System.out.println("3.xoá 1 sản phẩm theo id :");
                    int deleteId = scanner.nextInt();
                    Laptop managerDelete = managerLatop.deleteById(deleteId);
                    break;
                case 4:
                    System.out.println("4. hiển thị tất cả sản phẩm :");
                    managerLatop.displayAll();
                    break;
                case 5:
                    System.out.println("5.hiển thị tất cả sản phẩm theo hãng :");
                    String brand = scanner.nextLine();
                    managerLatop.displaybByBrand(brand);
                    break;
                case 6:
                    System.out.println("6.tìm kiếm một sản phẩm trong khoảng giá: ");


                    System.out.println("nhập giá dưới");
                    int minPrice = scanner.nextInt();
                    System.out.println("nhập giá trên :");
                    int maxPrice = scanner.nextInt();
                    managerLatop.rangePrice(minPrice, maxPrice);
                    break;
                case 7:
                    System.out.println("7. tìm kiếm sản phẩm theo hãng :");
                    System.out.println("nhập hãng");
                    String brand1 = scanner.nextLine();
                    managerLatop.searchLaptopByBrand(brand1);
                    break;
                case 8:
                    System.out.println("8.tìm kiểm sản phẩm theo màu sắc :");
                    System.out.println("nhập màu sắc");
                    String color = scanner.nextLine();
                    managerLatop.searchColor(color);
                    break;
                case 9:
                    try {
                        ArrayList<String> strings = managerLatop.listBrand();
                        managerLatop.writeBrand(strings, "/Volumes/WorkSpace/Codegym/ArrayList/src/btvn/bt2/exam/save.txt");
                        System.out.println("Write file successfully");
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 10:
                    try {
                        System.out.println("read file successfully");
                        managerLatop.readBrand("/Volumes/WorkSpace/Codegym/ArrayList/src/btvn/bt2/exam/save.txt");

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        } while (choice != 0);

    }
}
