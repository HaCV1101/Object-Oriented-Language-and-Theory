package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Book extends Media {

  private List<String> authors = new ArrayList<>();
  private String content;
  private List<String> contentTokens;
  private Map<String, Integer> wordFrequency;

  public Book(String title) {
    super(title);
  }

  public Book(String title, String category) {
    super(title, category);
  }

  public Book(String title, String category, List<String> authors) {
    super(title, category);
    this.authors = authors;
  }

  public Book(String title, String category, float cost, List<String> authors) {

    super(title, category, cost);
    this.authors = authors;
  }

  public Book(String title, String category, float cost, String author) {
    super(title, category, cost);
    this.authors.add(author);
  }

  public void setContent(String content) {
    this.content = content;
    this.processContent();
  }

  public String getContent() {
    return this.content;
  }

  public List<String> getContentTokens() {
    return this.contentTokens;
  }

  public Map<String, Integer> getWordFrequency() {
    return this.wordFrequency;
  }

  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }


  public void addAuthor(String authorName) {
    if (!authors.contains(authorName)) {
      authors.add(authorName);
    }
  }

  public void removeAuthor(String authorName) {
//    if (authors.contains(authorName)){
//      authors.remove(authorName);
//    }
    authors.remove(authorName);
  }

  @Override
  public void print() {
    System.out.println("------Book Info-------");
    System.out.println("Title: " + this.title);
    System.out.println("Category: " + this.category);
    System.out.print("Authors: ");
//    this.authors.forEach(e -> {
//      System.out.print(e + "-");
//    });
    Iterator<String> iter = authors.iterator();
    while (iter.hasNext()) {
      System.out.print(iter.next() + " ");
      if (iter.hasNext()) {
        System.out.print("-");
      }
    }
    System.out.println("\nCost: " + this.cost);
    System.out.println("----------------------");
  }

  @Override
  public int compareTo(Media media) {
    return super.compareTo(media);
  }

  private void processContent() {
    String[] cuts = content.split("[\n, .]+");
    this.contentTokens = Arrays.asList(cuts);
    Collections.sort(this.contentTokens);
    Iterator<String> stringIterator = this.contentTokens.iterator();
    this.wordFrequency = new TreeMap<String, Integer>();
    int val;
    String key;
    while (stringIterator.hasNext()) {
      key = stringIterator.next();
      val = 1;
      if (this.wordFrequency.containsKey(key)) {
        val = this.wordFrequency.get(key);
        val++;
      }
      this.wordFrequency.put(key, val);
    }
  }

  @Override
  public String toString() {
    StringBuilder format = new StringBuilder(
        "Title: " + this.title + "\nCategory: " + this.category + "\nCost: "+this.cost+"\nAuthors: ");
    Iterator<String> iter = authors.iterator();
    while (iter.hasNext()) {
      format.append(iter.next());
      if (iter.hasNext()) {
        format.append("-");
      }
    }
    format.append("\nContent length: ");
    format.append(this.contentTokens.size());
    format.append("s\nToken list: ");
    format.append(this.contentTokens);
    format.append("\nWord frequency: ");
    format.append(this.wordFrequency);
    return format.toString();
  }
}
