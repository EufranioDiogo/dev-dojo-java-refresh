package org.eufranio.javaoneforall.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 100;
        int intP = 1000;
        long longP = 10000;
        float floatP = 100.0F;
        double doubleP = 200.0;
        char charP = 'o';
        boolean booleanP = true;

        Byte byteW = 1; // outoboxing: converting primitive type to wrapper
        Short shortW = 100; //unboxing: converting wrapper into primitive types
        Integer intW = 1000;
        Long longW = 10000L;
        Float floatW = 100.0F;
        Double doubleW = 200.0;
        Character charW = 'o';
        Boolean booleanW = true;

        int newShortW = shortW;
        boolean newAuxBoolean = Boolean.parseBoolean("true");

        System.out.println("Value: " + newAuxBoolean);
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isUpperCase('a'));
    }
}
