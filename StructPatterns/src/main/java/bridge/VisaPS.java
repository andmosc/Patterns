package bridge;

public class VisaPS implements PaymentSystem{
    @Override
    public void printName() {
        System.out.println("Visa  ");
    }
}
