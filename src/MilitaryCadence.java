package src;

import java.io.File;
import java.util.ArrayList;
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
<<<<<<< HEAD
    /*private void fileReader(String fileName) {
=======
    private ArrayList<String> fileReader(String fileName) {
        ArrayList <String> fileasString;
>>>>>>> 1ad17599bb211e70d3929c537d612acb019e7815
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()) {
            fileasString.add(fileScanner.nextLine());
        }
<<<<<<< HEAD
    }*/
=======
        return fileasString;
    }
>>>>>>> 1ad17599bb211e70d3929c537d612acb019e7815
}
