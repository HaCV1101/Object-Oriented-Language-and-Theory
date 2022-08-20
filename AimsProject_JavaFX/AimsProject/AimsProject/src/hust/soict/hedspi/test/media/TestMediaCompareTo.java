package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class TestMediaCompareTo {

	public static void main(String[] args) {
		ArrayList<Media> media = new ArrayList<Media>();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 24.95f, 87, "Roger Allers");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 25.95f, 124, "George Lucas");
		ArrayList <String> authors = new ArrayList<String>();
		authors.add("Sugar daddy");
		authors.add("Sugar baby");
		Book book1 = new Book("Hands-on","Documentory",20.5f,authors);
		Book book2 = new Book("Zath","Documentory",18.5f,authors);
//		media.add(dvd1);
//		media.add(dvd2);
//		media.add(book1);
//		media.add(book2);
//		for(Media each : media) {
//			System.out.println(each.getTitle());
//		}
//		System.out.println("=========================");
//		Collections.sort(media);
//		for(Media each : media) {
//			System.out.println(each.getTitle());
//		}
		Collection collection = new ArrayList();
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(book1);
		collection.add(book2);
		
		Iterator iterator = collection.iterator();
		System.out.println("-------------------------------");
		System.out.println("The DVDs currently in the order  are:");
		while(iterator.hasNext()){
			System.out.println(((Media)iterator.next()).getCost());
		}
		
		Collections.sort((ArrayList)collection);
		iterator = collection.iterator();
		
		System.out.println("-------------------------------");
		System.out.println("The DVDs after sort in the order  are:");
		while(iterator.hasNext()){
			System.out.println(((Media)iterator.next()).getCost());
//			System.out.println(((Media)iterator.next()).getTitle());
		}
		
	}
}
