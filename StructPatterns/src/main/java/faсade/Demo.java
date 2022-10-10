package faсade;

public class Demo {
    public static void main(String[] args) {
        Facade facade = new Facade(new HellSystemA(),new HellSystemB());
        facade.simpleAction();
    }
}
