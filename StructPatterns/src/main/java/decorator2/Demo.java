package decorator2;

public class Demo {
    public static void main(String[] args) {
        DataSource dataSource = new DataSorceImpl();
        System.out.println(dataSource.getInteger());

        DataSource dataSorceDecoratorAdder = new DataSorceDecoratorAdder(dataSource);
        System.out.println(dataSorceDecoratorAdder.getInteger());

        DataSourceMultiplicator dataSourceMultiplicator = new DataSourceMultiplicator(dataSource);
        System.out.println(dataSourceMultiplicator.getInteger());
    }
}
