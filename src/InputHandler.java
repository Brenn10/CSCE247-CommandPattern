package src;

import java.util.ArrayList;

public class InputHandler {
    private ArrayList<Command> commands;

    public InputHandler(MilitaryCadence cadence) {
        commands.add(new IDontKnowCommand(cadence));
        commands.add(new InArmyCommand(cadence));
        commands.add(new EverywhereCommand(cadence));
    }

    public boolean playCadence(int num) {
        if(num <= commands.size()) {
            commands.get(num).execute();
            return true;
        }
        return false;
    }

}
