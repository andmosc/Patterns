package singltone;

public class Singleton {

    private Singleton () {
        System.out.println("run");
    }

    static Singleton getInstance() {
        System.out.println("getInstance");
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        static {
            System.out.println("init SingletonHolder");
        }

        static final Singleton instance = new Singleton();
    }
}

class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}