/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.hedspi.aims.Aims;

/**
 *
 * @author ADMIN
 */
public class MemoryDaemon implements java.lang.Runnable {
    protected long memoryUsed;

    public MemoryDaemon(long memoryUsed) {
        this.memoryUsed = memoryUsed;
    }
    public MemoryDaemon(){
        memoryUsed = 0;
    }
    @Override
    public void run(){
        Runtime rt = Runtime.getRuntime();
        long used;
        
        while (true){
            used = rt.totalMemory() - rt.freeMemory();
            if(used != memoryUsed){
                System.out.println("\tMemory used = " + used);
                memoryUsed = used;
            }
        }
    }
}
