package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {

  static Order[] orderList = new Order[Order.MAX_LIMITTED_ORDERS];
  static int nbOrder = 0;
  static Scanner sc = new Scanner(System.in);
  static MemoryDaemon daemon = new MemoryDaemon();

  public static void main(String[] args) {
    Thread memCon = new Thread(new MemoryDaemon());
    memCon.setDaemon(true);
    memCon.start();
    while (true) {
      showMenu();
    }
  }

  public synchronized static void showMenu() {
    System.out.println("Order Management Application: ");
    System.out.println("--------------------------------");
    System.out.println("1. Create new order");
    System.out.println("2. Add item to the order");
    System.out.println("3. Delete item by id");
    System.out.println("4. Display the items list of order");
    System.out.println("0. Exit");
    System.out.println("--------------------------------");
    System.out.println("Please choose a number: 0-1-2-3-4: ");
    int choose = sc.nextInt();
    switch (choose) {
      case 0:
        System.out.println("Exit");
        sc.close();
        System.exit(0);
      case 1:
        orderList[nbOrder++] = Order.createOrder();
        System.out.println("Create new order successfully!");
        break;
      case 2:
        if (orderList[nbOrder] == null) {
          System.out.println("You need to create an order first!");
        } else {
          System.out.println("Choose item type:\n1.Book\n2.DigitalVideoDisc\n3.CompactDisc");
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
                System.out.println("Input name of author " + (i + 1) + ":");
                String str = sc.nextLine();
                authors.add(str);
              }
              orderList[nbOrder - 1].addMedia(new Book(title, category, cost, authors));
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
              DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
              orderList[nbOrder - 1].addMedia(dvd);
              try {
                dvd.play();
              } catch (PlayerException e) {
                e.printStackTrace();
              }
            }
            case 3 -> {
              System.out.println("Input title CompactDisc: ");
              sc = new Scanner(System.in);
              String title = sc.nextLine();
              System.out.println("Input Category: ");
              String category = sc.nextLine();
              System.out.println("Input Director: ");
              String director = sc.nextLine();
              System.out.println("Input Artist: ");
              String artist = sc.nextLine();
              System.out.println("Input Cost: ");
              float cost = sc.nextFloat();
              System.out.println("Input the number of Track:");
              int num = sc.nextInt();
              List<Track> tracks = new ArrayList<>();
              for (int i = 0; i < num; i++) {
                sc.nextLine();
                System.out.println("Input Title " + (i + 1) + ":");
                String titleTrack = sc.nextLine();
                System.out.println("Input Length: " + (i + 1) + ":");
                int lengthTrack = sc.nextInt();
                Track track = new Track(titleTrack, lengthTrack);
                tracks.add(track);
              }
              CompactDisc cd = new CompactDisc(title, category, director, cost, artist, tracks);
              orderList[nbOrder - 1].addMedia(cd);
              try {
                cd.play();
              } catch (Exception e) {
                e.printStackTrace();
              }
            }
            default -> {
              System.out.println("Error!!!");
            }
          }
        }
        break;
      case 3:
        if (orderList[nbOrder - 1] == null) {
          System.out.println("You need to create an order first!");
        } else {
          orderList[nbOrder - 1].show();
          System.out.println("Input id: ");
          orderList[nbOrder - 1].removeMedia(sc.nextInt());
          System.out.println("Successfully deleted!");
        }
        break;
      case 4:
        if (orderList[nbOrder - 1] == null) {
          System.out.println("You need to create an order first!");
        } else {
          System.out.println("Input order's id:");
          int nborder = sc.nextInt();
          sc.nextLine();
          System.out.println("List of products in the order " + nborder + ":");
          orderList[nborder].show();
        }
        break;
      default:
        System.out.println("Selection error!!!");
    }

  }
}