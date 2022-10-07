package observer;

public class ConsomerB {

    private final Listener listener = date -> System.out.println(date + " Cosumer B");

    public Listener getListener() {
        return listener;
    }
}
