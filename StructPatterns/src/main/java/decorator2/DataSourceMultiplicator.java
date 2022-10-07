package decorator2;

public class DataSourceMultiplicator  implements DataSource{
    DataSource source;

    public DataSourceMultiplicator(DataSource source) {
        this.source = source;
    }

    @Override
    public int getInteger() {
        return this.source.getInteger()*2;
    }
}
