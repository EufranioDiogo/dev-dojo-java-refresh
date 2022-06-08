package org.eufranio.javaoneforall.javacore.Ycollections.test;

import org.eufranio.javaoneforall.javacore.Ycollections.domain.Customer;
import org.eufranio.javaoneforall.javacore.Ycollections.domain.Smartphone;

import java.util.*;

class CustomerComparableById implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return Long.compare(o1.getId(), o2.getId());
    }
}
public class NavigableMapTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Eufránio Diogo");
        Customer customer2 = new Customer("Creuma Kuzola");
        Smartphone mercedes = new Smartphone("1234", "S-1", "Mercedes");
        Smartphone mercedes1 = new Smartphone("1334", "S-2", "Mercedes");
        Smartphone mercedes2 = new Smartphone("1564", "S-3", "Mercedes");
        Smartphone mercedes_plus = new Smartphone("1234", "S-5", "Mercedes Plus");


        NavigableMap<Customer, List<Smartphone>> customersListHashMap = new TreeMap<>(new CustomerComparableById());


        customersListHashMap.put(customer1, new ArrayList<>(Arrays.asList(mercedes, mercedes_plus)));
        customersListHashMap.put(customer2, new ArrayList<>(Arrays.asList(mercedes1, mercedes2)));

        customersListHashMap.forEach((customer, smartphoneList) -> {
            System.out.println(customer);

            smartphoneList.forEach(System.out::println);
        });

        System.out.println("-----------------------------------");

        System.out.println(customersListHashMap.descendingMap());
    }
}
