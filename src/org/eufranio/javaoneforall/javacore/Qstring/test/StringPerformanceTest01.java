package org.eufranio.javaoneforall.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        concatString(100_000);

        long end = System.currentTimeMillis();

        System.out.println("Time took using simple String: " + (end - begin));

        long begin2 = System.currentTimeMillis();

        concatStringBuilder(100_000);

        long end2 = System.currentTimeMillis();

        System.out.println("Time took using stringBuilder: " + (end2 - begin2));


        long begin3 = System.currentTimeMillis();

        concatStringBuilder(100_000);

        long end3 = System.currentTimeMillis();

        System.out.println("Time took using buffer: " + (end3 - begin3));
    }

    private static void concatString(int size) {
        String text = "";

        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder text = new StringBuilder(size);


        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer text = new StringBuffer(size);


        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }
}
