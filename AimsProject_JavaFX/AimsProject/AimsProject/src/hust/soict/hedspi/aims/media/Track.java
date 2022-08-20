package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class Track implements Playable{
	private String title;
	private int length;
	
	
	public String getTitle() {
		return title;
	}


	public int getLength() {
		return length;
	}


	public Track() {
		// TODO Auto-generated constructor stub
	}


	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}


	public Track(String title) {
		super();
		this.title = title;
	}


	public Track(int length) {
		super();
		this.length = length;
	}
	
	public void play() throws PlayerException{
		if(this.getLength() >0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}else {
			throw new PlayerException("ERROR: DVD length is non-positive!");
		}

	}
	
	public boolean equals(Object o) {
		Track obj = (Track) o;
		if(obj == null) return false;
		if(this.getTitle().equals(obj.getTitle()) && this.getLength() == obj.getLength()) return true;
		return false;
	}
	
}
