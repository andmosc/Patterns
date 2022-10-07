package command;

public class Echo implements Command{
    @Override
    public String execute(String string) {
        return string;
    }
}
