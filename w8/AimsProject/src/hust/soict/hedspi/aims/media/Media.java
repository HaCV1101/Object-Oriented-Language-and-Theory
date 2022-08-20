package hust.soict.hedspi.aims.media;

import java.util.Objects;

public abstract class Media implements Comparable<Media> {

  protected String title;
  protected String category;
  protected float cost;


  public Media(String title, String category, float cost) {
    this(title, category);
    this.cost = cost;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public float getCost() {
    return cost;
  }

  public void setCost(float cost) {
    this.cost = cost;
  }

  public Media() {

  }

  public Media(String title) {
    this.title = title;
  }

  public Media(String title, String category) {
    this.title = title;
    this.category = category;
  }

  public abstract void print();

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Media media = (Media) o;
    return Float.compare(media.cost, cost) == 0 && Objects.equals(title,
        media.title) && Objects.equals(category, media.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, category, cost);
  }

  @Override
  public int compareTo(Media media) {
    return this.title.compareTo(media.title);
  }
}
