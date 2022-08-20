package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public class Track implements PlayAble, Comparable<Track> {

  private String title;
  private int length;

  public String getTitle() {
    return title;
  }

  public Track(String title, int length) {
    this.title = title;
    this.length = length;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public Track() {
    this.title = "";
    this.length = 0;
  }

  @Override
  public void play() throws PlayerException {
    if (this.getLength() <= 0) {
//      System.out.println("ERROR: DVD length is 0!");
      throw new PlayerException("ERROR: Track length is 0!");
    }
    System.out.println("Play Track: " + this.getTitle());
    System.out.println("Track length: " + this.getLength());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    try {
      if (o instanceof Track track2) {
        return (this.title.equals(track2.title) && this.length == track2.length);
      }
    } catch (NullPointerException | ClassCastException e) {
      e.printStackTrace();
      return false;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, length);
  }

  @Override
  public int compareTo(@NotNull Track track) {
    return this.title.compareTo(track.title);
  }
}
