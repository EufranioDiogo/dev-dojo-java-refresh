package org.eufranio.javaoneforall.javacore.Ycollections.test;

import org.eufranio.javaoneforall.javacore.Ycollections.domain.Customer;
import org.eufranio.javaoneforall.javacore.Ycollections.domain.Smartphone;

import java.util.*;
import java.util.function.BiConsumer;

public class MapTest02 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Eufránio");
        Customer customer2 = new Customer("Creuma");

        Smartphone mercedes = new Smartphone("1234", "S-1", "Mercedes");
        Smartphone mercedes1 = new Smartphone("1334", "S-2", "Mercedes");
        Smartphone mercedes2 = new Smartphone("1564", "S-3", "Mercedes");
        Smartphone mercedes_plus = new Smartphone("1234", "S-5", "Mercedes Plus");

        HashMap<Customer, List<Smartphone>> customerBoughtSmartphoneHashMap = new LinkedHashMap<>();

        customerBoughtSmartphoneHashMap.put(customer1, new ArrayList<>(Arrays.asList(mercedes, mercedes_plus)));
        customerBoughtSmartphoneHashMap.put(customer2, new ArrayList<>(Arrays.asList(mercedes1, mercedes2)));

        customerBoughtSmartphoneHashMap.forEach(printCustomerMangaList);
    }

    static BiConsumer<Customer, List<Smartphone>> printCustomerMangaList = ((customer, smartphones) -> {
        System.out.println(customer);

        smartphones.forEach(System.out::println);
    });
}
