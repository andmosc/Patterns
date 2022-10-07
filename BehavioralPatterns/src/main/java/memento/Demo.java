package memento;
//реализация функционала "undo","redo"
public class Demo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        State state = new State(new String[]{"A","B","C"});

        originator.saveState(state);
        state.getArray()[0] = "A1";
        System.out.println(state);


        System.out.println(originator.restoreState());

    }
}
