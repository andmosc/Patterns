package chainOfResonsibility;

public class ApplicationResult extends AppProcessor{
    @Override
    protected void proccesInternsl(Application application) {
        application.addHistory("Результат выдан");
    }

    @Override
    public String getProccesorName() {
        return "Выдача результатов";
    }
}
