package builder;
//создание объектов конструктор которого принимает много параметров
public class Demo {
    public static void main(String[] args) {
        BigObject bigObject = new BigObject.BigObjectBuilder("1")
                .withParam2("2")
                .withParam3("3")
                .withParam4("4")
                .build();
        System.out.println(bigObject);
    }
}
