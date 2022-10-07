package singltone;
//объектов у enama столько сколько перечислено у него самого
public class SingletonEnum {
    public enum SingletonInst {
        INSTANCE;

        SingletonInst() {
            System.out.println("run");
        }
    }
}

class Demo {
    public static void main(String[] args) {
        SingletonEnum.SingletonInst singleton = SingletonEnum.SingletonInst.INSTANCE;
    }
}
