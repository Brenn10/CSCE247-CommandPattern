package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Trey and Ian's part
public class MilitaryCadence {
<<<<<<< HEAD

=======
>>>>>>> 24efd8f400590d6f71e764364e3ce21a7cefa215
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
<<<<<<< HEAD
    /*private void fileReader(String fileName) {
=======
    private ArrayList<String> fileReader(String fileName) {
        ArrayList <String> fileasString;
>>>>>>> 1ad17599bb211e70d3929c537d612acb019e7815
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
=======
    private List<String> fileReader(String fileName) {
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            return null;
        }
        ArrayList<String> fileLines = new ArrayList<String>();
>>>>>>> 24efd8f400590d6f71e764364e3ce21a7cefa215
        while (fileScanner.hasNextLine()) {
            fileLines.add(fileScanner.nextLine());
        }
<<<<<<< HEAD
<<<<<<< HEAD
    }*/
=======
        return fileasString;
=======
        return fileLines;
>>>>>>> 24efd8f400590d6f71e764364e3ce21a7cefa215
    }
>>>>>>> 1ad17599bb211e70d3929c537d612acb019e7815
}
