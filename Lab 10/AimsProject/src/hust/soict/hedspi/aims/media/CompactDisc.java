package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class CompactDisc extends Disc implements PlayAble {

  private String artist;
  private List<Track> tracks;

  public CompactDisc(String title, String category, String director, float cost,
      String artist, List<Track> tracks) {
    super(title, category, director, cost);
    this.artist = artist;
    this.tracks = tracks;
  }

  public CompactDisc() {

  }

  public String getArtist() {
    return this.artist;
  }

  @Override
  public int getLength() {
    int sumLength = 0;
    for (Track track : tracks) {
      sumLength += track.getLength();
    }
    return (length = sumLength);
  }

  public void addTrack(Track track) {
    if (tracks.contains(track)) {
      System.out.println("Already exist");
    } else {
      tracks.add(track);
    }
  }

  public void removeTrack(Track track) {
    tracks.remove(track);
  }

  @Override
  public void play() throws PlayerException {
    if (this.getLength() <= 0){
//      System.out.println("ERROR: CD length is 0!");
      throw new PlayerException("ERROR: CD length is 0!");
    }
    System.out.println("Playing CD: "+this.getTitle());
    System.out.println("CD length: "+this.getLength());
    Iterator iter = tracks.iterator();
    while (iter.hasNext()){
      Track track = (Track) iter.next();
      try {
        track.play();
      }
      catch (PlayerException e){
        e.printStackTrace();
      }
    }
  }

  @Override
  public void print() {
    System.out.println("--------CD Info-------");
    System.out.println("Title: " + this.title);
    System.out.println("Artist: " + this.artist);
    System.out.println("Category: " + this.category);
    System.out.println("Director: " + this.director);
    System.out.println("Length: " + this.getLength());
    System.out.println("Cost: " + this.cost);
    System.out.println("----------------------");
  }

  @Override
  public int compareTo(@NotNull Media media) {
    if (media instanceof CompactDisc Disc) {
      return super.compareTo(Disc);//
    }
    return 0;
  }
}
