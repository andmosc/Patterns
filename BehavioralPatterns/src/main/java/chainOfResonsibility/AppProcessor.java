package chainOfResonsibility;

abstract class AppProcessor {

    private AppProcessor next;

    private AppProcessor getNext() {
        return next;
    }

    void setNext(AppProcessor next) {
        this.next = next;
    }

    void procces(Application application) {
        before();
        proccesInternsl(application);
        after();
        if (getNext() != null) {
            getNext().procces(application);
        }
    }

    protected abstract void proccesInternsl(Application application);

    public abstract String getProccesorName();

    private void before() {
        System.out.println("before: " + getProccesorName());
    }

    private void after() {
        System.out.println("after: " + getProccesorName());
    }
}
