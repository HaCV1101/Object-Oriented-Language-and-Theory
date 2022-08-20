package hust.soict.hedspi.test.media;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Book;
public class BookTest {

	public static void main(String[] args) {
		ArrayList <String> authors = new ArrayList<String>();
		authors.add("sugar daddy");
		authors.add("sugar baby");
		Book book1 = new Book("hands-on","Documentory",19.65f,authors);
		book1.setContent("thang giap aaa ngu si ngu.aaa");
		System.out.println(book1);
	}

}
