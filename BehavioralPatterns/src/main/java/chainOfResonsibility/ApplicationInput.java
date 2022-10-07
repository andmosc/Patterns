package chainOfResonsibility;

public class ApplicationInput extends AppProcessor {
    @Override
    protected void proccesInternsl(Application application) {
        application.addHistory("Заявление принято");
    }

    @Override
    public String getProccesorName() {
        return "Прием заявлений";
    }
}
