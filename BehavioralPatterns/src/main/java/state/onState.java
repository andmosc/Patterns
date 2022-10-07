package state;

public class onState implements State{
    @Override
    public State action() {
        System.out.println("включено");
        return StateProvider.getOffState();
    }
}
