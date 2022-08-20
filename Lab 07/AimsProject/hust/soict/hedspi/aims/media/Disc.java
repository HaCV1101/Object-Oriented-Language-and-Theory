/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.hedspi.aims.media;

/**
 *
 * @author ADMIN
 */
public class Disc extends Media{
    protected int length;
    protected String directory;

    public int getLength() {
        return length;
    }

    public String getDirectory() {
        return directory;
    }

    public Disc(int length, String directory, String title, String category) {
        super(title, category);
        this.length = length;
        this.directory = directory;
    }

    public Disc(int length, String directory) {
        this.length = length;
        this.directory = directory;
    }
    
    public Disc(){
        this.length = 0;
        this.directory = "";
    }
    
}
