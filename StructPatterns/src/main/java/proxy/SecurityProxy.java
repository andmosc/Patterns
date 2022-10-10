package proxy;

public class SecurityProxy implements SecurityAcces{
    SecurityAcces securityAcces;

    public SecurityProxy(SecurityAcces securityAcces) {
        this.securityAcces = securityAcces;
    }

    @Override
    public void acces() {
        System.out.println("before");
        securityAcces.acces();
        System.out.println("after");
    }
}
