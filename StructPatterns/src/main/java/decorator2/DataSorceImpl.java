package decorator2;

public class DataSorceImpl implements DataSource{
    @Override
    public int getInteger() {
        return 10;
    }
}
