package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class DiskTest {

  public static void main(String[] args) {
    DigitalVideoDisc dvd1 = new DigitalVideoDisc(
        "Big hand", "Animation", "Forger Alerts", 124, 30.4f);
    System.out.println(dvd1.search("KING                PORTER"));
  }
}