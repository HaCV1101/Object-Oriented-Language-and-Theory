/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.hedspi.aims.media;

/**
 *
 * @author ADMIN
 */
public class DigitalVideoDisc extends Disc implements Playable{
    // khai bao cac thuoc tinh
//    private String title;
//    private String category;
//    private String directory;
//    private int length;
//    private float cost;
    
    // Xay dung cac phuong thuc
    //1. Cac phuong thuc get/set
//    public String getTitle(){
//        return this.title;
//    }
//    public void setTitle(String title){
//        this.title = title;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }

//    public String getDirectory() {
//        return directory;
//    }
//
//    public void setDirectory(String directory) {
//        this.directory = directory;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        if(length > 0)
//            this.length = length;
//        else 
//            this.length = 0;
//    }

//    public float getCost() {
//        return cost;
//    }
//
//    public void setCost(float cost) {
//        if(cost > 0)
//            this.cost = cost;
//        else 
//            this.cost = 0.0f;
//    }
    // 2. Cac phuong thuc khoi tao (constructor)
    // -Nhiem vu vua constructor: tao vung nho (memory)
    // chua thong tin cua object va thiet lap / gan gia tri
    // cho cac thuoc tinh cua object
    // -Dac diem cua constructor:
    // + Ten cua constructor trung voi ten cua lop
    // + Ko co kieu tra ve, ko dung tu khoa void
    // + Co the xay dung nhieu constructor voi tham so khac nhau, giup khoi tao doi tuong theo nhieu cach khac nhau
    
    // 2.1 Constructor khong tham so
    public DigitalVideoDisc(){
            super();
        this.title = "";
        this.category = "";
        this.directory = "";
        this.length = 0;
        this.cost = 0.0f;       
    }
    
    // 2.2 Constructor co 1 tham so: create DVD object by title
    public DigitalVideoDisc(String title){
        super();
        this.title = title;
    }
    
//    // 2.3 Constructor co 2 tham so
//
    public DigitalVideoDisc(String title, String category) {
        super();
        this.title = title;
        this.category = category;
    }
    //2.4 Constructor co 3 tham so

    public DigitalVideoDisc(String title, String category, String directory) {
        super();
        this.title = title;
        this.category = category;
        this.directory = directory;
    }
    
    // 2.5 Constructor with all attributes

    public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.length = length;
        this.cost = cost;
    }
    
    // 3. Cac phuong thuc khac
    // Phuong thuc in thong tin cua doi tuong DVD
    public void printInfo(){
        System.out.println("\n-----DVD Info-----");
        System.out.println("Title: " + this.title);
        System.out.println("Category: " + this.category);
        System.out.println("Director: " + this.directory);
        System.out.println("Length: " + this.length);
        System.out.println("Cost: " + this.cost);
    }
    
    // Day dung phuong thuc tim kiem theo title
    public boolean search(String stitle){
        // Tach title cua tham so can tim thanh cac tu (word)
        //--> phuc vu cho viec xu ly tim kiem
        String sTitle[] = title.split(" ");
        for (int i = 0; i < sTitle.length; i++) {
            if(!this.title.contains(sTitle[i])) return false;
        }
        return true;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    
    
    
    
    
    
}
