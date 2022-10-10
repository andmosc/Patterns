package command2;

import java.util.LinkedList;

/** превращаем запрос в объект, передаем как аргументы при
 * вызове методов, можем ставить запросы в очередь, логировать их,
 * а также поддерживать отмену операций.
  */
public class main {
    public static void main(String[] args) {
        LinkedList<Command> list = new LinkedList<>();
        list.add(()-> System.out.println("action1"));
        list.add(()-> System.out.println("action2"));
        list.add(()-> System.out.println("action3"));

        list.descendingIterator().forEachRemaining(Command::execute);

    }
}
