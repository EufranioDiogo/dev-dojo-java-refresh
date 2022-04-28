package org.eufranio.javaoneforall.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        division(5, 0);
    }

    /**
     *
     * @param a can be any number
     * @param b can be any number but it can't be zero
     * @return
     * @throws IllegalArgumentException if b is zero
     */
    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("The second parameter can't be zero");
        }

        return a / b;
    }
}
