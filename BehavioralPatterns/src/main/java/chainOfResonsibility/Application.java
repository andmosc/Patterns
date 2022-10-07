package chainOfResonsibility;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private final List<String> history = new ArrayList<>();

    void  addHistory(String record) {
        history.add(record);
    }

    void printHistory() {
        System.out.println(history);
    }
}
