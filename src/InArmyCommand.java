package src;

/**
 * InArmyCommand is a type of Command.
 * @author Brennan Cain
 */
public class InArmyCommand implements Command {
    private MilitaryCadence cadence; // MilitaryCadence is required for the execute method

    /**
     * Constructor for InArmyCommand.
     * @param cadence we use this to execute the InArmyCommmand 
     */
    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    /**
     * Execute in army command.
     */
    public void execute() {
        cadence.singInArmy();
    }
}
