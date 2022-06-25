package org.eufranio.javaoneforall.javacore.ZZBparameterization.interfaces;

import org.eufranio.javaoneforall.javacore.ZZBparameterization.domain.Car;

import java.util.function.Predicate;

public interface CarPredicate {
    boolean test(Car car);
}
