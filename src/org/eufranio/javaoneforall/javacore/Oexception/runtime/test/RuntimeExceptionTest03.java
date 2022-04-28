package org.eufranio.javaoneforall.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

    }

    private static boolean openingDBConnection() {
        try {
            System.out.println("Opening connection");

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Closing resources... ");
            System.out.println("Opening connection method finished");
        }
        return false;
    }
}
