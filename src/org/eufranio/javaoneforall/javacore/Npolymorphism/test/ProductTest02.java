package org.eufranio.javaoneforall.javacore.Npolymorphism.test;

import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Computer;
import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Product;
import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Television;
import org.eufranio.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest02 {
    public static void main(String[] args) {
        Product computer = new Computer("Lenovo E560", 2000);
        Computer computer2 = new Computer("HP Pavillion", 3000);
        Television television = new Television("Samsung 2022", 5000);

        computer2.reference = "dids0329ekw";
        /* ERROR: computer.reference = "dkdmsksd"; */
        System.out.println(computer);
        System.out.println("---------------------------------");
        System.out.println(television);
        System.out.println("---------------------------------");

        ProductTaxReportService.generateProductTaxReport(computer);
        System.out.println("---------------------------------");

        ProductTaxReportService.generateProductTaxReport(computer2);
        System.out.println("---------------------------------");

        ProductTaxReportService.generateProductTaxReport(television);
    }
}
