package singltone;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
        System.out.println("run");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            System.out.println("lazy");
            instance = new LazySingleton();
        }
        return instance;
    }
}

class DemoLazy {
    public static void main(String[] args) {
        LazySingleton singleton =  LazySingleton.getInstance();
        System.out.println(singleton);
    }
}
