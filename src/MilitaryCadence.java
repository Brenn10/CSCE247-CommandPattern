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

    }

    public void singEverywhereWeGo() {

    }

    public void singInArmy() {
        
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
