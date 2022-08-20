package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("text.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String s = " ";
        while (br.ready()) {
            s += br.readLine();
        }
        System.out.println(System.currentTimeMillis() - start);
        br.close();
        isr.close();
        fis.close();
    }
}
