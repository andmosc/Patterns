package adapter;

public class SDSadapter implements SDSdrill{

    private final Drill drill;

    public SDSadapter(Drill drill) {
        this.drill = drill;
    }

    @Override
    public void action() {
        System.out.println(this.drill);
    }
}
