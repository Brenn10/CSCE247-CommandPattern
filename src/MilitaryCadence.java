package src;

import java.io.File;
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
    private String fileReader(String fileName) {
        String fileasString = "";
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            fileasString += fileScanner.nextLine();
        }
        return fileasString;
    }
}
