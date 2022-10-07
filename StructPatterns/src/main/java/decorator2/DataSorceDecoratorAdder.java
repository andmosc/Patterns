package decorator2;

public class DataSorceDecoratorAdder implements DataSource{
    private final DataSource dataSource;

    public DataSorceDecoratorAdder(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int getInteger() {
        return dataSource.getInteger() + 5;
    }
}
