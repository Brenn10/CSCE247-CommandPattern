package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Trey and Ian's part
public class MilitaryCadence {
    public MilitaryCadence() {

    }
    
    public void singIDontKnow() {
        List<String> IDontKnow = fileReader("idontknow.txt");
        // helper function for sing

    }

    public void singEverywhereWeGo() {
        List<String> everywhereWeGo = fileReader("everywhere.txt");
        // helper function for sing
    }

    public void singInArmy() {
        List<String> InArmy = fileReader("inarmy.txt");
        // helper function for sing
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
