package proxy;

public class Demo {
    public static void main(String[] args) {
        SecurityAcces securityAcces = new SecurityProxyImpl();
        SecurityProxy securityProxy = new SecurityProxy(securityAcces);
        securityProxy.acces();
    }
}
