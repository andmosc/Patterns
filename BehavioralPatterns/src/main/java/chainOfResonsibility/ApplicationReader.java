package chainOfResonsibility;

public class ApplicationReader extends AppProcessor{
    @Override
    protected void proccesInternsl(Application application) {
        application.addHistory("Заявление прочтено");
    }

    @Override
    public String getProccesorName() {
        return "Чтение заявление";
    }
}
