/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.hedspi.test;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

/**
 *
 * @author ADMIN
 */
public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("JungLe");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void main(){
        
    }
    public static void swap(Object o1, Object o2){
    Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
                
    }
    
    // 3. Classifier member:
    // - Tu khoa final: khai bao hang
    // - Tu khoa static: khai bao cac thanh phan chung cho tat ca cac doi tuong cua class
    // - Cac thanh phan static duoc xac dinh khi bien dich
    // + 1 chuong trinh co 2 giai doan:
    // ~ compile time (tĩnh)
    // ~ runtime   (Các thành phần còn lại)
    // + Cac thanh phan static co the goi truc tiep qua ten cua class ma ko can khoi tao doi tuong
    // + Cac phương thức static chỉ gọi đến các thuộc tính hoặc phương thức static khác trong lớp
}

