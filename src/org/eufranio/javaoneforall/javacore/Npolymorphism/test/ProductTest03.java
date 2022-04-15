package org.eufranio.javaoneforall.javacore.Npolymorphism.test;

import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Computer;
import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Product;
import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import org.eufranio.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

import java.util.Scanner;

public class ProductTest03 {
    public static void main(String[] args) {
        Product lenovo_e560 = new Computer("Lenovo E560", 2000);
        Computer ryzen_9 = new Computer("Ryzen 9", 1000);
        Tomato brazilian = new Tomato("Brazilian", 20);


        ryzen_9.reference = "sdijdsi32dsk";

        ProductTaxReportService.generateProductTaxReport(ryzen_9);
        ProductTaxReportService.generateProductTaxReport(lenovo_e560);
        ProductTaxReportService.generateProductTaxReport(brazilian);
    }
}
