package hust.soict.hedspi.test;

import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestMediaCompareTo {

  public static void main(String[] args) {
    List<DigitalVideoDisc> collection = new ArrayList<>();
    DigitalVideoDisc dvd1, dvd2, dvd3;
    dvd1 = new DigitalVideoDisc("BTitle1", "dsf", "aside", 23, 21);
    dvd2 = new DigitalVideoDisc("ATitle2", "dsf", "aside", 23, 21);
    dvd3 = new DigitalVideoDisc("CTitle3", "dsf", "aside", 23, 21);
    collection.add(dvd1);
    collection.add(dvd2);
    collection.add(dvd3);
    Iterator<DigitalVideoDisc> iterator = collection.iterator();
    System.out.println("-------------------------------------------");
    System.out.println("The DVD currently in the order are: ");
    while (iterator.hasNext()){
      System.out.println((iterator.next()).getTitle());
    }
    Collections.sort(collection);
    System.out.println("-------------------------------------------");
    System.out.println("The DVD in sorted order are: ");
    iterator = collection.iterator();
    while (iterator.hasNext()){
      System.out.println((iterator.next()).getTitle());
    }
  }

}
