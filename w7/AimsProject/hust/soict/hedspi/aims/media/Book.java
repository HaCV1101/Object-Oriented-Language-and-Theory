/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Book extends Media {
//    private String title;
//    private String category;
//    private float cost;
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    
    public Book(){
        
    }
    
    public void addAuthor(String authorName){
        if(!(authors.contains(authorName))){
            authors.add(authorName);
        }
    }
    
    public void removeAuthor(String authorName){
        if((authors.contains(authorName))){
            authors.remove(authorName);
        }
    }
    
    Book(String title){
        super(title);
    }
    
    Book(String title, String category){
        super(title, category);
    }
    
    Book(String title, String category, List<String> authors){
        super(title, category);
        this.authors = authors;
        //Todo: check author condition
    }
    
}
