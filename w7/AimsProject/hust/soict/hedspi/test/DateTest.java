/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.hedspi.test;

import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.MyDate;

/**
 *
 * @author ADMIN
 */
public class DateTest {

    public static void main(String[] args) {
//        System.out.println("Date a: ");
//        MyDate a = new MyDate("Se 29th 2001");
//        a.print();
//        System.out.println("\nDate b: ");
//        MyDate b = new MyDate();
//        b.print();
//        b.setDay(15);
//        b.print();
//        System.out.println("\nDate c:");
//        MyDate c = new MyDate("Feb 29 1600");
//        c.print();
//        System.out.println("\nDate d:");
//        MyDate d = new MyDate("Sept. 28sn 2001");
//        d.print();
//        d.accept();
//        d.print();
        MyDate e = new MyDate("twenty_eighth", "September", "twenty one");
        e.print("MMMM d yyyy");
        e.print("yyyy-MM-dd");
        e.print("MM/dd/yyyy");
        
        System.out.println("*");
        MyDate a = new MyDate(1, 1, 2001);
        MyDate b = new MyDate("Jan 1st 2001");
        MyDate c = new MyDate(12, 10, 2004);
        MyDate d = new MyDate(25, 7, 2001);
        
        DateUtils.compare(a, b);
        System.out.println("**");
        for (MyDate myDate : DateUtils.sortDate(a, b, c, d, e)) {
            myDate.print();
        }
    }
}
