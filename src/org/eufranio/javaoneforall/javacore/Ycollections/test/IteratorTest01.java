package org.eufranio.javaoneforall.javacore.Ycollections.test;

import org.eufranio.javaoneforall.javacore.Ycollections.domain.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>(6);

        carList.add(new Car(1, "X5", "BMW", 20_000, 0));
        carList.add(new Car(1, "M8", "BMW", 35_000, 2));
        carList.add(new Car(1, "Land Cruiser", "Toyota", 17_500, 3));
        carList.add(new Car(1, "Avensa", "Toyota", 13_000, 0));
        carList.add(new Car(1, "Alto", "Suzuki", 5_000, 1));

        Iterator<Car> carIterator = carList.iterator();
        
        while(carIterator.hasNext()) {
            Car next = carIterator.next();
            if (next.getQuantity() == 0) {
                carIterator.remove();
            }
        }

        System.out.println(carList);
        

    }
}
