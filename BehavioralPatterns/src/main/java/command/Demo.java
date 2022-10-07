package command;
// как официант в ресторане, прослойка между клиентом и поваром
public class Demo {
    public static void main(String[] args) {

        Executer executer = new Executer();

        executer.addCommand(new AdderABC());
        executer.addCommand(new Echo());
        executer.addCommand(String::toUpperCase);

        executer.executeCommands();
    }
}
