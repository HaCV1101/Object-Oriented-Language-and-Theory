package hust.soict.hedspi.aims.media;

public class Disc extends Media {

	private int length;
	private String director;
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public Disc(String title, String category, float cost, int length, String director) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
		this.length = length;
		this.director = director;
	}
	
	public Disc(String title, String category, float cost, String director) {
		super(title, category, cost);
		this.director = director;
	}
	
	
	
	
	
}
