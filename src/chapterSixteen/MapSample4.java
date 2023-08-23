package chapterSixteen;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MapSample4 {
    public static void main(String[] args) {
        LinkedList<Customer> list = new LinkedList<>();
        list.add(new Customer(1,"sunny", 20_000_000.00));
        list.add(new Customer(3, "madam ugo", 500_000_000.00));
        list.add(new Customer(4, "prof", 30_000_000.00));

        Comparator<Customer> comparator = (c1,c2) ->{
            if (c1.getBalance() > c2.getBalance()) return -1;
            else if (c2.getBalance() > c1.getBalance()) return 1;
            return 0;
        };
        Collections.sort(list,comparator);

        System.out.println(list);
    }
}
