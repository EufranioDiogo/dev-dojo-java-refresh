package org.eufranio.javaoneforall.javacore.Tresourcebundle.test;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("labels", new Locale("en", "US"));

        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("labels", new Locale("pt", "AO"));

        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

        // Locale("fr", "CA");
        // messages_fr_CA.properties
        // messages_fr.properties
        // messages_en_US.properties
        // messages_en.properties
        // messages.properties

    }
}
