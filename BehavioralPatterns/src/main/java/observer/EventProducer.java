package observer;

import java.util.ArrayList;
import java.util.List;


public class EventProducer {
    private List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void event(String data) {
        listeners.forEach(listener -> listener.onUpdate(data));
    }

    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }
}
