package src;
/**
 * IDontKnowCommand is a type of Command.
 * @author Brennan Cain
 */
public class IDontKnowCommand implements Command {
    private MilitaryCadence cadence; // MilitaryCadence is required for the execute method

    /**
     * Constructor for the IDontKnowCommand.
     * @param cadence we use this to execute the IDontKnowCommmand 
     */
    public IDontKnowCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    /**
     * Execute I dont know command.
     */
    public void execute() {
        cadence.singIDontKnow();
    }
}
