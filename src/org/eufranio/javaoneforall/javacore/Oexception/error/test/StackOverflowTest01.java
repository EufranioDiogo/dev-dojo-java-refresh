package org.eufranio.javaoneforall.javacore.Oexception.error.test;

import org.jetbrains.annotations.NotNull;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        StackOverflowTest01.somaSucessiva(1);
    }

    public static int somaSucessiva(@NotNull  int n) {
        System.out.println(n);
        if (n < 0) {
            return 0;
        }
        return n + somaSucessiva(n + 1);
    }
}
