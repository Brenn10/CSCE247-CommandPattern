package src;
import java.util.ArrayList;
/**
 * This class handles the input from the user.
 * @author Stella Garcia
 */
public class InputHandler {
    private ArrayList<Command> commands; // the different types of commands will be stored her

    /**
     * Initialzes the ArrayList with the indices specified in the assignment description.
     * @param cadence how to execute each command is in the MilitaryCadence class
     */
    public InputHandler(MilitaryCadence cadence) {
        commands = new ArrayList<Command>();
        commands.add(new IDontKnowCommand(cadence));
        commands.add(new InArmyCommand(cadence));
        commands.add(new EverywhereCommand(cadence));
    }

    /**
     * Calls the correct Command's execute method.
     * @param num the index number of the commands ArrayList that we want to play.
     * @return true if cadence is available, false otherwise.
     */
    public boolean playCadence(int num) {
        if (num <= commands.size()) {
            commands.get(num).execute();
            return true;
        }
        return false;
    }

}
