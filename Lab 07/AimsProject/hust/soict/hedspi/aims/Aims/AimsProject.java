/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class AimsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread memCon = new Thread(new MemoryDaemon(), "Memory Observation");
        memCon.setDaemon(true);
        memCon.start();
        
        int choice;
        int n = 0;
        int orderId;
        int itemId = 0;
        Scanner keyboard = new Scanner(System.in);
        Order[] orderList = new Order[Order.MAX_LIMITTED_ORDERS];
        
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Luot "+ i + ": ");
//            keyboard.nextInt();
//            System.out.println("");
//        }
        
        do {
            showMenu();
            choice = Integer.parseInt(keyboard.nextLine());
            switch (choice) {
                case 1: 
                    break;
                case 2:
                    System.out.println("1. Book\n");
                    System.out.println("2. CompactDisc");
                    System.out.println("3. DigitalVideoDisc");
                    break;
                default:
                    break;
            }
        } while(choice != 0);
        
        
//        DigitalVideoDisc dvd0 = new DigitalVideoDisc();
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
//        dvd1.setCategory("Animation");
////        dvd1.setDirectory("Roger Allers");
////        dvd1.setLength(87);
//        dvd1.setCost(19.95f);
//        
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.95f);
//        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladdi", "Animation", "John Musker", 90, 30f);
//        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladi", "Animation", "John Musker", 90, 20f);
//        dvd0.printInfo();
//        dvd1.printInfo();
//        dvd2.printInfo();
//        dvd3.printInfo();
        
        //Tao mot don hang moi
//        Order anOrder = new Order();
//        System.out.println("***Mang rong***");
//        anOrder.removeDigitalVideoDisc(dvd4);
//        System.out.println("**Total cost is: " + anOrder.totalCost());
//        System.out.println("So dia: " + anOrder.getQtyOrdered());
//        //Them cac dia DVD vao don hang
//        anOrder.addDigitalVideoDisc(dvd1);
//        anOrder.addDigitalVideoDisc(dvd2);
//        anOrder.addDigitalVideoDisc(dvd3);
//        //In ra tong gia tri cua don hang
//        System.out.println("\n*Total cost is: " + anOrder.totalCost());
//        System.out.println("So dia: " + anOrder.getQtyOrdered());
//        System.out.println("***Ko trong mang***");
//        anOrder.removeDigitalVideoDisc(dvd4);
//        System.out.println("Total cost after removal: " + anOrder.totalCost());
//        System.out.println("So dia: " + anOrder.getQtyOrdered());
//        anOrder.addDigitalVideoDisc(dvd4);
//        anOrder.addDigitalVideoDisc(dvd5);
//        System.out.println("***Co trong mang***");
//        anOrder.removeDigitalVideoDisc(dvd5);
//        System.out.println("Total cost after removal: " + anOrder.totalCost());
        //System.out.println("So dia: " + anOrder.getQtyOrdered());
        
            
        
    }
    public static void showMenu(){
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number (0-1-2-3-4): ");

    }
}
