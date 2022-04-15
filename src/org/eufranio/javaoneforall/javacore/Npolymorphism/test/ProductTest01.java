package org.eufranio.javaoneforall.javacore.Npolymorphism.test;

import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Computer;
import org.eufranio.javaoneforall.javacore.Npolymorphism.domain.Tomato;
import org.eufranio.javaoneforall.javacore.Npolymorphism.service.ProductTaxReportService;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer lenovo_e560 = new Computer("Lenovo E560", 2000);
        Tomato italian = new Tomato("Italian", 5);

        ProductTaxReportService.generateProductTaxReport(lenovo_e560);
        ProductTaxReportService.generateProductTaxReport(italian);
    }
}
