package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
public class TestPassingParameter {

  public static void main(String[] args) {
    DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
    DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
    swap(jungleDVD, cinderellaDVD);
    System.out.println("Jungle: " + jungleDVD.getTitle());
    System.out.println("Cinderella: " + cinderellaDVD.getTitle());
    changeTitle(jungleDVD, cinderellaDVD.getTitle());
    System.out.println("Jungle: " + jungleDVD.getTitle  ());
  }

  public static void swap(Object disc1, Object disc2) {
    Object temp = disc1;
    disc1 = disc2;
    disc2 = temp;
  }

  public static void changeTitle(DigitalVideoDisc disc, String title) {
    String oldTitle = disc.getTitle();
    disc.setTitle(title);
    disc = new DigitalVideoDisc(oldTitle);
  }
}