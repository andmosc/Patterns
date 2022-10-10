package faсade;

public class Facade {
    private final HellSystemA hellSystemA;
    private final HellSystemB hellSystemB;

    public Facade(HellSystemA hellSystemA, HellSystemB hellSystemB) {
        this.hellSystemA = hellSystemA;
        this.hellSystemB = hellSystemB;
    }

    public void simpleAction() {
        hellSystemA.actionA();
        hellSystemB.actionB();
        hellSystemA.actionAA();
    }
}
