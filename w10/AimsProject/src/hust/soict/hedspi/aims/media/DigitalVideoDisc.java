package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;
import hust.soict.hedspi.aims.media.Media;
import java.util.Locale;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

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

  @Override
  public String toString() {
    return "------DVD Info-------\n" + "Title: " + this.title + "\nCategory: " + this.category
        + "\nDirector: " + this.director + "\nLength: " + this.length + "\nCost: " + this.cost
        + "\n----------------------\n";
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
    try {
      DigitalVideoDisc that = (DigitalVideoDisc) o;
      return Float.compare(that.cost, cost) == 0 && Objects.equals(title,
          that.title);
    } catch (NullPointerException | ClassCastException e) {
      e.printStackTrace();
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, category, director, length, cost);
  }

  @Override
  public int compareTo(@NotNull Media media) {
    return super.compareTo(media);
  }

  @Override
  public void play() throws PlayerException {
    if (this.getLength() <= 0) {
//      System.out.println("ERROR: DVD length is 0!");
      throw new PlayerException("ERROR: DVD length is 0!");
    }
    System.out.println("Playing DVD: " + this.getTitle());
    System.out.println("DVD length: " + this.getLength());
  }
}
