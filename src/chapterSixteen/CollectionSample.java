package chapterSixteen;

import java.util.Set;
import java.util.TreeSet;

public class CollectionSample {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"zainab", 3_000_000.00);
        Customer customer1 = new Customer(1,"prof", 300_000.00);
        Customer customer2 = new Customer(1,"femi", -300_000.00);
        Set<Customer> customers = new TreeSet<>();
        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);

        System.out.println(customers);

    }
}
