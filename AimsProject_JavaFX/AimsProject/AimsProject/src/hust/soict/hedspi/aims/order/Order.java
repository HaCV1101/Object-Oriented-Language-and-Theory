package hust.soict.hedspi.aims.order;
import java.util.ArrayList;

import javax.naming.LimitExceededException;

import hust.soict.hedspi.aims.media.Media;
//import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10; // ý mà max item
	public static final int MAX_LIMITED_ORDERS =5;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private static int nbOrders = 0;
	protected MyDate dateOrdered;
	private int id;
	public Order() throws LimitExceededException{
		super();
		if(this.nbOrders < MAX_NUMBERS_ORDERED) {
			nbOrders ++;
			this.dateOrdered = new MyDate();
		}else {
			throw new LimitExceededException("ERROR: The number of orders  has reached  its limit");
		}
		
	}
	
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	
	public static int getNbOrders() {
		return nbOrders;
	}


	public static void setNbOrders(int nbOrders) {
		Order.nbOrders = nbOrders;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}


	public boolean addMedia(Media media) {
		if(this.getItemsOrdered().size() < MAX_NUMBERS_ORDERED) {
			this.getItemsOrdered().add(media);
			return true;
		}
		return false;
	}
	
	public boolean removeMedia(Media media){
		if(this.getItemsOrdered().contains(media)) {
			this.getItemsOrdered().remove(media);
			System.out.println(this.getItemsOrdered());
			return true;
		}
		return false;
	}
	
//	public Media findMediaById(int id) {
//		for (Media media: this.getItemsOrdered()) {
//			if(media.getId() == id) {
//				System.out.println("abc");
//				return media;
//			}
//		}
//		return null;
//	}
	
	public String toString() {
		String s ="";
		for (Media media: this.getItemsOrdered()) {
			s += "abc ";
		}
		return s;
	}
	public float totalCost() {
		float sum = 0;
		for(Media media : this.getItemsOrdered()) {
			sum += media.getCost();
		}
		return sum;
	}
	
	
//	public void print() {
//		System.out.println("***********************Order***********************");
//		System.out.print("Date: ");
//		System.out.println(this.dateOrdered);
//		System.out.println("Ordered Items:");
//		int sum = 0;
//		for(DigitalVideoDisc disc : itemsOrdered) {
//			sum+=disc.getCost();
//			System.out.println("1. DVD"+" - "+ disc.getTitle() + " - " + 
//				disc.getCategory() + " - "+disc.getDirector() +" - " + disc.getLength()+": "+ disc.getCost());
//		}
//		System.out.println("Total cost: " + sum);
//		System.out.println("***************************************************");
//	}
//	
//	public float totalCost() {
//		float sum = 0;
//		for(DigitalVideoDisc disc : this.itemsOrdered) {
//			sum += disc.getCost();
//		}
//		return sum;
//	}
//	
//	public DigitalVideoDisc getALuckyItem() {
//		int length = this.getQtyOrdered();
//		DigitalVideoDisc item = itemsOrdered[(int) (length* Math.random())];
//		item.setCost(0);
//		return item;
//		
//	}
}
