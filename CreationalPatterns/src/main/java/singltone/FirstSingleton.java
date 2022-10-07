package singltone;

public class FirstSingleton {

    private static FirstSingleton instance = new FirstSingleton();

    private FirstSingleton() {
        System.out.println("run");
    }

    public static FirstSingleton getInstance() {
        return instance;
    }
}

class demoFirst {
    public static void main(String[] args) {
        FirstSingleton singleton = FirstSingleton.getInstance();
        System.out.println(singleton);
    }
}
