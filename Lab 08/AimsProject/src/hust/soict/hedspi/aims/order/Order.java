package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {

  //Khai bao hang so: so luong toi da
  public static final int MAX_NUMBERS_ORDERED = 10;
  public static final int MAX_LIMITTED_ORDERS = 5;
  private static int nbOrders = 0;
  //Khai bao mang cac doi tuong DVD
  private List<Media> itemsOrdered = new ArrayList<Media>();
  //Khai bao thuoc tinh chua so luong so phan tu hien co trong don hang
  private MyDate dateOrdered;

  private Order() {
    this.dateOrdered = new MyDate();
    nbOrders++;
  }

  public static Order createOrder() {
    if (nbOrders >= MAX_LIMITTED_ORDERS) {
      System.out.println("The number orders is almost full!!!");
      return null;
    } else {
      nbOrders++;
      return new Order();
    }
  }

  public MyDate getDateOrdered() {
    return dateOrdered;
  }

  public void setDateOrdered(MyDate dateOrdered) {
    this.dateOrdered = dateOrdered;
  }

  public void addMedia(Media media) {
    if (!this.itemsOrdered.contains(media) && this.itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
      this.itemsOrdered.add(media);
    }
  }

  public void removeMedia(int media) {
    this.itemsOrdered.remove(media);
  }

  public void show() {
    int index = 0;
    for (Media media : itemsOrdered) {
      System.out.println("ID " + (index++) + ":");
      media.print();
    }
  }

  //Phuong thuc tinh tong gia tri cua don hang
  public float totalCost() {
    float total = 0.0f;
    Media mediaItem;
    for (Media media : itemsOrdered) {
      mediaItem = media;
      total += mediaItem.getCost();
    }
    return total;
  }

  public Media getALuckyItem() {
    Random rd = new Random();
    int luckyNumber = rd.nextInt(this.itemsOrdered.size());
    this.itemsOrdered.get(luckyNumber).setCost(0f);
    return this.itemsOrdered.get(luckyNumber);
  }
}
