package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.media.Media;
import java.util.Locale;
import java.util.Objects;

public class DigitalVideoDisc extends Disc implements PlayAble {

  public DigitalVideoDisc() {
    super();
  }

  public DigitalVideoDisc(String title) {
    super(title);
  }

  public DigitalVideoDisc(String title, String category) {
    super(title, category);
  }

  public DigitalVideoDisc(String title, String category, float cost) {
    super(title, category, cost);
  }

  public DigitalVideoDisc(String title, String category, String director, float cost) {
    super(title, category, director, cost);
  }

  public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    super(title, category, director, length, cost);
  }

  //3 Cac phuong thuc khac
  //Phuong thuc in thong tin cua doi tuong dvd
  @Override
  public void print() {
    System.out.println("------DVD Info-------");
    System.out.println("Title: " + this.title);
    System.out.println("Category: " + this.category);
    System.out.println("Director: " + this.director);
    System.out.println("Length: " + this.length);
    System.out.println("Cost: " + this.cost);
    System.out.println("----------------------");
  }

  public boolean search(String title) {
    String[] keywords = title.split(" +");
    for (String i : keywords
    ) {
      if (this.getTitle().toLowerCase().contains(i.toLowerCase())) {
        return true;
      }
    }
    return false;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalVideoDisc that = (DigitalVideoDisc) o;
    return length == that.length && Float.compare(that.cost, cost) == 0 && Objects.equals(title,
        that.title) && Objects.equals(category, that.category) && Objects.equals(director,
        that.director);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, category, director, length, cost);
  }

  @Override
  public int compareTo(Media media) {
    return super.compareTo(media);
  }

  @Override
  public void play() {
    System.out.println("Playing DVD: " + this.getTitle());
    System.out.println("DVD length: " + this.getLength());
  }
}
