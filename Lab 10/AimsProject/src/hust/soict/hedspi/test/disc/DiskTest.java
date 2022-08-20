package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import java.sql.Date;

public class DiskTest {

  public static void main(String[] args) {
    DigitalVideoDisc dvd1 = new DigitalVideoDisc(
        "Big hand", "Animation", "Forger Alerts", 124, 30.4f);
    System.out.println(dvd1.search("SON                HAn"));
    DigitalVideoDisc a = null;
    Media b = new Book("T");
    System.out.println(dvd1.equals(b));
    System.out.println("dsad");
  }
}