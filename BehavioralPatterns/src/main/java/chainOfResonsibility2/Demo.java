package chainOfResonsibility2;

import java.util.Arrays;
import java.util.List;

/** цепочка обязанностей
*Область применения — всевозможные обработчики событий, последовательные проверки доступа и прочее.
 */

public class Demo {
    static final List<Prosessor> PROSESSORS = Arrays.asList(
            msg -> {
                if (msg.startsWith("Hello")) {
                    System.out.println("Hi, customer");
                    return true;
                }
                return false;
            },
            msg -> {
                if (msg.startsWith("Привет")) {
                    System.out.println("Привет, клиент");
                    return true;
                }
                return false;
            }
    );

    public static void main(String[] args) {
        String msg = "Привет, дружок";
        for (Prosessor prosessor : PROSESSORS) {
            if (prosessor.process(msg))
                break;
        }
    }
}
