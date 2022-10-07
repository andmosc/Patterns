package chainOfResonsibility;
//выполнение промежуточных значений: получение, обработка, результат
public class Demo {
    public static void main(String[] args) {
        Application apl = new Application();

        AppProcessor input = new ApplicationInput();
        AppProcessor reader = new ApplicationReader();
        AppProcessor result = new ApplicationResult();

        input.setNext(reader);
        reader.setNext(result);

        input.procces(apl);

        apl.printHistory();


    }
}
