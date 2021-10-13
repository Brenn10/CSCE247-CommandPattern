package src;
/**
 * EverywhereCommand is a type of Command.
 * @author Brennan Cain.
 */
public class EverywhereCommand implements Command{
    private MilitaryCadence cadence;

    /**
     * Constructor for the EverywhereCommand.
     * @param cadence we use this to excute EverywhereCommand.
     */
    public EverywhereCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    /**
     * Execute everywhere cadence.
     */
    public void execute() {
        cadence.singEverywhereWeGo();
    }
}
