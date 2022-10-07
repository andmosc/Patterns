package Composite;
import java.util.List;

public class Group implements Unit{
    private final List<Unit> unit;

    public Group(List<Unit> unit) {
        this.unit = unit;
    }

    @Override
    public void move() {
        unit.forEach(Unit::move);
    }

}
