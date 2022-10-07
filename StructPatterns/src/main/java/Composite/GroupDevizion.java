package Composite;

import java.util.List;

public class GroupDevizion implements Unit{
    private final List<Group> list;

    public GroupDevizion(List<Group> list) {
        this.list = list;
    }

    @Override
    public void move() {
        list.forEach(Group::move);
    }
}
