/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
    
    public String getArtist(){
        return artist;
    }
    
    public int getLength(ArrayList<Track> tracks){
        int sumlength = 0;
        for (int i = 0; i < tracks.size(); i++) {
            sumlength += tracks.get(i).getLength();
        }
        super.length = sumlength;
        return super.length;
    }
    
    public void addTrack(Track track){
        if(tracks.contains(track)){
            System.out.println("Already exist");
        } else {
        tracks.add(track);
    }
    }
    
    public void removeTrack(Track track){
        if(!tracks.contains(track)){
            System.out.println("Not exist");
        } else {
            tracks.remove(track);
        }
    }

    @Override
    public void play() {
        // viet cac lenh hien thi thong tin cua CompactDisc
        System.out.println("Artist: " + this.artist);
        System.out.println("Category: " +  this.category);
        System.out.println("Directory: " + this.directory);
        System.out.println("Title: " + this.title);
        System.out.println("Length: " + this.getLength(tracks));
        for (int i = 0; i < tracks.size(); i++) {
            tracks.get(i).play();
        }
    }
}
