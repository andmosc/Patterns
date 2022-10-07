package state;

public class StateProvider {

    private static final State onState = new onState();
    private static final State offState = new OffState();

    public StateProvider() {
    }

    public static State getOnState() {
        return onState;
    }

    public static State getOffState() {
        return offState;
    }
}
