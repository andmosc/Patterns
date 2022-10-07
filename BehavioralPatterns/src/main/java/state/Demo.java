package state;

//применяется тогда когда поведение объекта должно меняться в зависимости от его текущего состояния(пр.светофор)
//нет единого места принятия решения
public class Demo {
    public static void main(String[] args) {
        BulbContext context = new BulbContext();
        context.performAction();
        context.performAction();
        context.performAction();
    }
}
