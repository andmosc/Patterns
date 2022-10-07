package state;

public class OffState implements State{
    @Override
    public State action() {
        System.out.println("выключено");
        return StateProvider.getOnState();
    }
}
