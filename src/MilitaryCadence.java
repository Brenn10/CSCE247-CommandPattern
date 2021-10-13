package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 * Constructor for Military Cadence.
 * @author Ian and Trey
 */
public class MilitaryCadence {

    /**
     * Default constructor for Military Cadence.
     */
    public MilitaryCadence() {}

    /**
     * Sings i dont know.
     */
    public void singIDontKnow() {
        List<String> iDontKnow = fileReader("idontknow.txt");
        // helper function for sing
        sing(iDontKnow);
    }

    /** 
     * Sings everywhere we go.
     */
    public void singEverywhereWeGo() {
        List<String> everywhereWeGo = fileReader("everywhere.txt");
        // helper function for sing
        sing(everywhereWeGo);
    }
    
    /** 
     * Sings in army song.
     */
    public void singInArmy() {
        List<String> inArmy = fileReader("inarmy.txt");
        // helper function for sing
        sing(inArmy);
    }
    
    /** 
     * Prints list one line at a time with a delay.
     * @param song song broken up into lines.
     */
    public void sing(List<String> song) {
        Iterator<String> port = song.iterator();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(port.next());
        while (port.hasNext()) {
            try {
                TimeUnit.MILLISECONDS.sleep(100); // very fast, but leaving per instruction
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(port.next());
        }
    }

    /** 
     * Reads a file to a list of strings, broken up by line.
     * @param fileName name of file to be read.
     * @return List containing lines of file.
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
