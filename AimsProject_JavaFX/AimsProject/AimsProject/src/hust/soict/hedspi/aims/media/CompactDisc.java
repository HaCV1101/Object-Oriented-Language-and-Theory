package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

import hust.soict.hedspi.aims.PlayerException;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	
	
	public String getArtist() {
		return artist;
	}


	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}

	
	public CompactDisc(String title, String category, float cost, String director, String artist, Track ...args) {
		super(title, category, cost, director);
		this.artist = artist;
		for(Track track: args) {
			this.addTrack(track);
		}
	}
	
	public void addTrack(Track inputTrack) {
		if(!this.tracks.contains(inputTrack)) {
			this.tracks.add(inputTrack);
		}
	}
	
	public void removeTrack(Track inputTrack) {
		if(this.tracks.contains(inputTrack)) {
			this.tracks.remove(inputTrack);
		}
	}

	public int getLength() {
		int length = 0;
		for(Track track: this.tracks) {
			length += track.getLength();
		}
		return length;
	}
	
	public void play() throws PlayerException{
		if(this.getLength()>0) {
			java.util.Iterator iter = tracks.iterator();
			Track nextTrack;
			while(iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				}catch(PlayerException e) {
					throw e;
				}
			}
		}else {
			throw new PlayerException("ERROR: CD length is non-positive!");
		}
	}
	
	public int compareTo(Object o) {
		CompactDisc obj = (CompactDisc) o;
		if(this.getLength() < obj.getLength()) return -1;
		if(this.getLength() == obj.getLength()) return 0;
		else return 1;
		
	}
}
