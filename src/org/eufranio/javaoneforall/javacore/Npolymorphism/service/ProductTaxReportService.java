package org.eufranio.javaoneforall.javacore.Npolymorphism.service;

import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Computer;
import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Product;
import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import org.jetbrains.annotations.NotNull;

public abstract class  ProductTaxReportService {
     public static void generateProductTaxReport(@NotNull Product product) {
        System.out.println("Starting product report");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product: " + product.getName());
        System.out.println("Product price: " + product.getPrice());
        System.out.println("Tax: " + taxValue);
        System.out.println("Total: " + (product.getPrice() + taxValue));

        if (product instanceof Computer) {
            System.out.println("Reference: " + ((Computer) product).reference);
        }
    }
}
