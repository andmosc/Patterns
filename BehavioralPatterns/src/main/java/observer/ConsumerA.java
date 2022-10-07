package observer;

public class ConsumerA implements Listener{
    @Override
    public void onUpdate(String date) {
        System.out.println(date + " Consumer A");
    }
}
