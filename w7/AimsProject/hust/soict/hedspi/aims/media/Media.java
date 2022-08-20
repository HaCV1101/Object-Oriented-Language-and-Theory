/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.hedspi.aims.media;

/**
 *
 * @author ADMIN
 */
public abstract class Media {
    protected String title;
    protected String category;
    protected float cost;

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
        if(cost > 0)
            this.cost = cost;
        else 
            this.cost = 0.0f;
    }

    public Media() {
    }
    
   Media(String title){
       this.title = title;
   }
   
   Media(String title, String category){
       this(title);
       this.category = category;
   }
    
    
}
