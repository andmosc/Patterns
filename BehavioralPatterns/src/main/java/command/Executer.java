package command;

import java.util.ArrayList;
import java.util.List;

public class Executer {
    private List<Command> listCommand = new ArrayList<>();

    public void addCommand(Command command) {
        listCommand.add(command);
    }

    public void executeCommands() {
        listCommand.stream().map(command -> command.execute("value")).forEach(System.out::println);
    }
}
