package 泛型;

import java.util.ArrayList;
import java.util.List;

public class GenericComplex {
    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.size() == 0) {
            return null;
        }
        T t = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (t.compareTo(list.get(i)) < 0) {
                t = list.get(i);
            }
        }
        return t;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(8);
        list1.add(18);
        list1.add(22);
        Integer max = max(list1);
        System.out.println("max="+max);
        List<Vehicle>  list2 = new ArrayList<Vehicle>();
        list2.add(new Vehicle(80,"blue"));
        list2.add(new Vehicle(150,"black"));
        list2.add(new Bus(200,"green",2));
        Vehicle vehicle = max(list2);
        System.out.println(vehicle.getSpeed());
        List<Bus> list3 = new ArrayList<Bus>();
        list3.add(new Bus(20,"bule",1));
        list3.add(new Bus(150,"black",1));
        list3.add(new Bus(100,"green",1));
        Bus bus = max(list3);

    }
}
