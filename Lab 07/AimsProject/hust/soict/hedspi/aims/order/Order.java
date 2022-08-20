/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Viet code dong 43
package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Order {

    // Khai bao mot hang so: so luong san pham toi da
    public static final int MAX_NUMBERS_ORDER = 10;
    // Khai bao mot mang cac doi tuong DVD
    // Khai bao thuoc tinh chua so luong phan tu hien co trong don hang
    //private int qtyOrdered = 0;
    public static final int MAX_LIMITTED_ORDERS = 5;
    private static int nbOrders = 0;
    private MyDate dateOrdered;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public Order() {
        dateOrdered = new MyDate();
    }

    // Xay dung cac phuong thuc get/set
//    public int getQtyOrdered() {
//        return qtyOrdered;
//    }
//
//    public void setQtyOrdered(int qtyOrdered) {
//        this.qtyOrdered = qtyOrdered;
//    }
    // Xay dung phuong thuc them 1 doi tuong DVD vao don hang
    // noi dung: them mot doi tuong vao mang itemsOrdered
    // --> phai kiem tra xem mang da bi day chua?
//    public void addDigitalVideoDisc(DigitalVideoDisc disc){
//        if(this.qtyOrdered == MAX_NUMBERS_ORDER) 
//            System.out.println("The order is almost full");
//        else{
//            this.itemOrdered[qtyOrdered] = disc;
//            qtyOrdered++;
//            System.out.println("The disc has been added");
//            System.out.println("Total disc: " + this.qtyOrdered);
//        }
//    }
    // 1 gtham so la mang cac doi tuong DigitalVideoDisc
//    public void addDigitalVideoDisc(DigitalVideoDisc discList[]){
//        if(this.qtyOrdered == MAX_NUMBERS_ORDER) 
//            System.out.println("The order is almost full");
//        else if (this.qtyOrdered + discList.length > MAX_NUMBERS_ORDER){
//            System.out.println("Neu them se tran");
//        }else {
////            for (int i = 0; i < discList.length; i++) {
////                this.addDigitalVideoDisc(discList[i]);
////            }
//            
//            for(DigitalVideoDisc dvd: discList)
//                this.addDigitalVideoDisc(dvd);
//        }
//    }
    // 2 tham so la 2 doi tuong DigitalVideoDisc
//    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
//        if(this.qtyOrdered == MAX_NUMBERS_ORDER) 
//            System.out.println("The order is almost full");
//        else if (this.qtyOrdered + 2 > MAX_NUMBERS_ORDER){
//            System.out.println("Neu them se tran");
//        }else {
//            this.addDigitalVideoDisc(disc1);
//            this.addDigitalVideoDisc(disc2);
//        }
//       
//    }
    // Phuong thuc xoa mot doi tuong khoi don hang
//    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
//        //Viet lenh loa bo doi tuong DVD khoi mang
//        //Luu y kiem tra tinh huong mang rong
//        int mark = 1;
//        if(this.qtyOrdered == 0)
//            System.out.println("\nThere are no discs\n");
//        else {
//            for(int i = 0; i < qtyOrdered; i++) {
//                if(this.itemOrdered[i] == disc){
//                    mark = 0;
//                    for (int j = i; j < qtyOrdered - 1; j++) {
//                        this.itemOrdered[j] = this.itemOrdered[j+1];
//                    }
//                    qtyOrdered--;
//                }
//            }
//            if(mark == 0) {
//                System.out.println("\nThe disc has been removed");
//                System.out.println("Total disc: " + this.qtyOrdered + "\n");
//            } else 
//                System.out.println("\nThis disc doesn't exist!\n");
//            
//        }
//}

//Phuong thuc tinh tong gia tri cua don hang
    
    public void addMedia(Media media){
        if(!this.itemsOrdered.contains(media))
            this.itemsOrdered.add(media);
    }
    
    public void removeMedia(Media media) {
        if(this.itemsOrdered.contains(media))
            this.itemsOrdered.remove(media);
    }
        
        
        
        
    public float totalCost(){
        // store the running total ò the items in the order
        float total = 0.0f;
        Media mediaItem;
        java.util.Iterator iter = itemsOrdered.iterator();
        while(iter.hasNext()){
            mediaItem = (Media) (iter.next());
            total += mediaItem.getCost();
        }
        return total;
    }
    
    // Java: cac loi goi phuong thuc truyen tham so theo gia tri
    
    public static Order createOrder() {
        if (nbOrders >= MAX_LIMITTED_ORDERS) {
            System.out.println("Đã đạt đến số lượng đơn đặt hàng tối đa!");
            return null;
        } else {
            nbOrders++;
            return new Order();
        }
    }
    
    public Media getALuckyItem(){
        Random rd = new Random();
        int luckyNumber = rd.nextInt(this.itemsOrdered.size());
        itemsOrdered.get(luckyNumber).setCost(0);
        return itemsOrdered.get(luckyNumber);
    }
    
    
    
    
}
