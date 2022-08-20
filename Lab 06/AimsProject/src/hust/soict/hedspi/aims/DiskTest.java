package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {
    public static void main(String[] args) {
        Order anOrder = Order.createOrder();
        if (anOrder != null) {
            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
            dvd1.setCategory("Animation");
            dvd1.setCost(19.95f);
            dvd1.setDirector("Roger Allers");
            dvd1.setLength(87);

            anOrder.addMedia(dvd1);

            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
            dvd2.setCategory("Science Fiction");
            dvd2.setCost(24.95f);
            dvd2.setDirector("George Lucas");
            dvd2.setLength(124);

            anOrder.addMedia(dvd2);

            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
            dvd3.setCategory("Animation");
            dvd3.setCost(18.99f);
            dvd3.setDirector("John Musker");
            dvd3.setLength(90);

            anOrder.addMedia(dvd3);

            System.out.println(anOrder.getALuckyItem().getTitle());
            System.out.println(dvd1.search("king"));
        }
    }
}
