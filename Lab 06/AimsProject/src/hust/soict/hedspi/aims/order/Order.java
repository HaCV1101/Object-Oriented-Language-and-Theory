package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMIT_ORDERS = 5;
    private final ArrayList<Media> itemsOrdered = new ArrayList<>();
    private static int nbOrders = 0;
    private MyDate dateOrdered = new MyDate();

    private Order() {
    }

    public static Order createOrder() {
        if (nbOrders >= MAX_LIMIT_ORDERS) {
            System.out.println("The number orders is almost full!!!");
            return null;
        } else {
            nbOrders++;
            return new Order();
        }
    }

    public void addMedia(Media media) {
        if (!this.itemsOrdered.contains(media))
            this.itemsOrdered.add(media);
    }

    public void addMedia(Media[] media) {
        List<Media> discList = new ArrayList<>();
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("The order is almost full!");
        } else {
            for (Media media1 : media) {
                if (itemsOrdered.size() > MAX_NUMBERS_ORDERED) {
                    discList.add(media1);
                    continue;
                }
                itemsOrdered.add(media1);
            }
        }
        if (discList.size() != 0) {
            System.out.println("list of items that cannot be added: ");
            discList.forEach(digitalVideoDisc -> System.out.println(digitalVideoDisc.getTitle()));
        }
    }


    public void removeMedia(int id) {
        itemsOrdered.remove(id);
    }

    public void show() {
            itemsOrdered.forEach((System.out::println));
    }


    public void removeMedia(Media media) {
        if (this.itemsOrdered.contains(media))
            this.itemsOrdered.remove(media);
    }

    public float totalCost() {
        //store tge running total of the items in the order
        float total = 0;
        Media mediaItem;
        java.util.Iterator iter = itemsOrdered.iterator();
        while (iter.hasNext()) {
            mediaItem = (Media) (iter.next());
            total += mediaItem.getCost();
        }
        return total;
    }

    public Media getALuckyItem() {
        Random rd = new Random();
        int luckyNumber = rd.nextInt(this.itemsOrdered.size());
        itemsOrdered.get(luckyNumber).setCost(0);
        return itemsOrdered.get(luckyNumber);
    }
}
