package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Aims {
    static Order order;

    public static void main(String[] args) {
        while (true) showMenu();
    }

    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4: ");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose) {
            case 0:
                System.out.println("Exit");
                System.exit(0);
            case 1:
                order = Order.createOrder();
                System.out.println("Create new order successfully!");
                break;
            case 2:
                if (order == null) {
                    System.out.println("You need to create an order first!");
                } else {
                    System.out.println(" Choose item type:\n 1.Book \n 2.DigitalVideoDisc ");
                    int case2 = sc.nextInt();
                    switch (case2) {
                        case 1 -> {
                            System.out.println("Input title Book: ");
                            sc = new Scanner(System.in);
                            String title = sc.nextLine();
                            System.out.println("Input Category: ");
                            String category = sc.nextLine();
                            System.out.println("Input Cost: ");
                            float cost = sc.nextFloat();
                            System.out.println("Input Authors: ");
                            List<String> authors = new ArrayList<>();
                            System.out.println("Input the number of authors:");
                            int num = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < num; i++) {
                                System.out.println("Input name of author " + (i+1) + ":");
                                String str = sc.nextLine();
                                System.out.println(str);
                                authors.add(str);
                            }
                            order.addMedia(new Book(title, category, cost, authors));
                        }
                        case 2 -> {
                            System.out.println("Input title DigitalVideoDisc: ");
                            sc = new Scanner(System.in);
                            String title = sc.nextLine();
                            System.out.println("Input Category: ");
                            String category = sc.nextLine();
                            System.out.println("Input Director: ");
                            String director = sc.nextLine();
                            System.out.println("Input Length: ");
                            int length = sc.nextInt();
                            System.out.println("Input Cost: ");
                            float cost = sc.nextFloat();
                            order.addMedia(new DigitalVideoDisc(title, category, director, length, cost));

                        }
                        default -> {
                            System.out.println("Error!!!");
                            System.exit(1);
                        }
                    }
                }
                break;
            case 3:
                if (order == null) {
                    System.out.println("You need to create an order first!");
                } else {
                    order.show();
                    System.out.println("Input id: ");
                    order.removeMedia(sc.nextInt());
                    System.out.println("Successfully deleted!");
                }
                break;
            case 4:
                if (order == null) {
                    System.out.println("You need to create an order first!");
                } else {
                    System.out.println("List of products in the order: ");
                    order.show();
                }
                break;
            default:
                System.out.println("Selection error!!!");

        }

    }
}
