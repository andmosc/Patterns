package proxy;

public class SecurityProxyImpl implements SecurityAcces{
    @Override
    public void acces() {
        System.out.println("access to bank account");
    }
}
