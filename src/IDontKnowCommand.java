package src;

public class IDontKnowCommand implements Command {
    private MilitaryCadence cadence;

    public IDontKnowCommand(MilitaryCadence militaryCadence) {
        this.cadence = militaryCadence;
    }
    public void execute() {
        cadence.singIDontKnow();
    }
}
