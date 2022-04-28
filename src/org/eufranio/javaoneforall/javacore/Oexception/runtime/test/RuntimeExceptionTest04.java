package org.eufranio.javaoneforall.javacore.Oexception.runtime.test;

import javax.management.RuntimeErrorException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }


        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Inside " + e.getClass());
        } catch (IndexOutOfBoundsException e) {
            e = new ArrayIndexOutOfBoundsException();
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            e = new RuntimeException();
            System.out.println();
        }
    }
}
