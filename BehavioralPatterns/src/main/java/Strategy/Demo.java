package Strategy;

// когда на лету надо обновить алгоритм совершение какого-то действия
// отделяем применение от конкретных стратегий - логика

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new Car()); // стратегия
        context.applyStrategy(); // применение

        context.setStrategy(new Bus());
        context.applyStrategy();

        context.setStrategy(new Taxi());
        context.applyStrategy();

        context.setStrategy(() -> System.out.println("Долететь на ракете"));
        context.applyStrategy();

    }
}
