package org.eufranio.javaoneforall.javacore.ZZBparameterization.interfaces;

import org.eufranio.javaoneforall.javacore.ZZBparameterization.domain.Car;

@FunctionalInterface // is a interface the has only one method to be implemented and can be used with lambdas
public interface _Predicate<T> {
    boolean test(T car);
}
