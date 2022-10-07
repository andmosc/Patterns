package Composite;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Unit> unit = Arrays.asList(new Marine(),new Tank());
        List<Unit> unit2 = Arrays.asList(new Tank(),new Tank());
        List<Group> group = Arrays.asList(new Group(unit),new Group(unit2));
        //Group group = new Group(unit);
        //Group group1 = new Group(unit2);

        GroupDevizion groupDevizion = new GroupDevizion(group);
        groupDevizion.move();


    }
}
