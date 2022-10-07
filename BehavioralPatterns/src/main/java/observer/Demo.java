package observer;
// наблюдатель
 public class Demo {
    public static void main(String[] args) {
        ConsumerA consumerA = new ConsumerA();
        ConsomerB consumerB = new ConsomerB();
        EventProducer eventProducer = new EventProducer();

        eventProducer.addListener(consumerA);
        eventProducer.addListener(consumerB.getListener());

        eventProducer.event("A");
        eventProducer.event("A");

        eventProducer.removeListener(consumerA);
        eventProducer.removeListener(consumerB.getListener());

        //eventProducer.eventConsumer("EveA");
        //eventProducer.eventConsumer("EveB");
    }
}
