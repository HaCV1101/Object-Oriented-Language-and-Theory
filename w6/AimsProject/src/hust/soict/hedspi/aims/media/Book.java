package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book() {
        super();
    }

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
    public Book(String title, String category, float cost, List<String> authors){
        super(title, category, cost);
        this.authors = authors;
    }
    public void addAuthor(String authorName) {
        if (authors.contains(authorName))
            System.out.println("The author's name already exists!");
        else
            authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        if (!authors.contains(authorName))
            System.out.println("This author does not exist!");
        else
            authors.remove(authorName);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (String author : authors)
            s.append(author).append(", ");
        s = new StringBuilder(s.substring(0, s.length() - 2));
        return "Book has title: " + this.getTitle() + ", category: " + this.getCategory() + ", author: " + s;
    }
}
