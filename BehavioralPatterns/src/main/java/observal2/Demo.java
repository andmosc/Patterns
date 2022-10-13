package observal2;

public class Demo {
    public static void main(String[] args) {
        R r = new R();
        Emitter emitter = new Emitter();
        emitter.subscribe(r::refute);
        emitter.subscribe(msg -> System.out.println(msg.toUpperCase() + "!!!"));
        emitter.say("Earth is round");

    }
}
