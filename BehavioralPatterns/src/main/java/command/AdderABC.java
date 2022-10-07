package command;

public class AdderABC implements Command{
    @Override
    public String execute(String string) {
        return string + " ABC";
    }
}
