package hust.soict.hedspi.aims.Aims;
import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.LimitExceededException;

import hust.soict.hedspi.aims.PlayerException;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.MemoryDaemon;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.order.Order;
public class Aims {
	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
}
	
	

	
	public static void main(String[] args) throws LimitExceededException {
		MemoryDaemon md = new MemoryDaemon();
		Thread thread = new Thread(md);
		thread.setDaemon(true);
		thread.start();
		ArrayList <String> authors = new ArrayList<String>();
		authors.add("sugar daddy");
		authors.add("sugar baby");
		Book book1 = new Book("hands-on","Documentory",19.65f,authors);
		Book book2 = new Book("math","Documentory",20.5f,authors);
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 19.95f, 87, "Roger Allers");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, 124, "George Lucas");
		
		Scanner scanner = new Scanner(System.in);
		int choice; int id; int idItem;
		Order newOrder= null;
//		ArrayList<Order> listOrder = new ArrayList<Order>();
		while(true) {
			showMenu();
			choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
				try {
					newOrder = new Order();
				} catch (LimitExceededException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					System.out.println("nhap id cua order");
					id = scanner.nextInt();
					newOrder.setId(id);
					break;
				case 2:
					System.out.println("Option: ");
					System.out.println("--------------------------------");
					System.out.println("1. Book");
					System.out.println("2. CompactDisc");
					System.out.println("3. DigitalVideoDisc");
					System.out.println("--------------------------------");
					System.out.println("Please choose a number: 1-2-3");
					int choicee;
					choicee = scanner.nextInt();
					switch(choicee) {
						case 1:
							System.out.println("are you sure 1/y : 2/n");
							int x = scanner.nextInt();
							if(x == 1) {
								newOrder.addMedia(book1);
							}
							break;
						case 3:
							System.out.println("are you sure 1/y : 2/n");
							x = scanner.nextInt();
							if(x == 1) {
								newOrder.addMedia(dvd1);
							}
							try {
								dvd1.play();
							}catch(PlayerException e) {
								System.err.println("A problem occured: " + e);
							}
							break;
						case 2:
							System.out.println("are you sure 1/y : 2/n");
							Track track1 = new Track("My heart", 3);
							CompactDisc compactDisc1 = new CompactDisc("Lover", "Romance", 15f, "Nghiemdz", "Taylor Swift");
							compactDisc1.addTrack(track1);
							x = scanner.nextInt();
							if(x == 1) {
								newOrder.addMedia(compactDisc1);
							}
							try {
								compactDisc1.play();
							}catch(PlayerException e) {
								System.err.println("A problem occured: " + e);
							}
							break;
							
					}
					assert newOrder.addMedia(book1): "cannot add media";
					break;
//				case 3:
//					System.out.println("nhap id muon xoa");
//					idItem = scanner.nextInt();
//					Media media1 = newOrder.findMediaById(idItem);
//					assert newOrder.removeMedia(media1): "cannot remove media";
//					break;
//				case 4:
//					System.out.println("display");
//					System.out.println(newOrder.getItemsOrdered());
//					System.out.println("display Order");
//					for(Media media: newOrder.getItemsOrdered()) {
//						media.printMedia();
//					}
//					break;
				case 0:
					scanner.close();
					System.exit(0);
				default:
					System.out.println("nhap sai, nhap lai");
					choice = scanner.nextInt();
					break;
			}
		}
	}
}