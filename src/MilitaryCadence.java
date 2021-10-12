package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
// Trey and Ian's part
public class MilitaryCadence {
    public MilitaryCadence() {

    }
    
    public void singIDontKnow() {
        List<String> IDontKnow = fileReader("idontknow.txt");
        // helper function for sing
        sing(IDontKnow);
    }

    public void singEverywhereWeGo() {
        List<String> everywhereWeGo = fileReader("everywhere.txt");
        // helper function for sing
        sing(everywhereWeGo);
    }

    public void singInArmy() {
        List<String> InArmy = fileReader("inarmy.txt");
        // helper function for sing
        sing(InArmy);
    }
    public void sing(List<String> song) {
        Iterator<String> port = song.iterator();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(port);
        while(port.hasNext()) {
            try {
                TimeUnit.SECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(port.next());
        }
    }
    /** 
     * @author Trey Sturman
     * reads a file from the specified location and returns it as a string
     * @return file as a string
     */ 
    private List<String> fileReader(String fileName) {
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            return null;
        }
        ArrayList<String> fileLines = new ArrayList<String>();
        while (fileScanner.hasNextLine()) {
            fileLines.add(fileScanner.nextLine());
        }
        return fileLines;
    }
}
