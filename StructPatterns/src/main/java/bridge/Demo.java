package bridge;
//применяется когда надо иерархию интерфейсов отделить от иерархии имплемитации.
//такое отделение требуется если надо интерф. и имплемитацию менять независимо
public class Demo {
    public static void main(String[] args) {
        Card card = new CreditCard(new VisaPS());
        card.info();
        Card card2 = new CreditCard(new MirPS());
        card2.info();
        Card card3 = new DebitCard(new VisaPS());
        card3.info();
        Card card4 = new DebitCard(new MirPS());
        card4.info();

    }
}
