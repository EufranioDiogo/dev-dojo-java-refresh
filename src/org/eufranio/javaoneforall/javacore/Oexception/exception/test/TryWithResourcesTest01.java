package org.eufranio.javaoneforall.javacore.Oexception.exception.test;

import org.eufranio.javaoneforall.javacore.Oexception.exception.domain.Reader01;
import org.eufranio.javaoneforall.javacore.Oexception.exception.domain.Reader02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile1();
    }

    private static void readFile1() {
        try(
                //Reader reader = new BufferedReader(new FileReader("test.txt"));
                Reader01 reader01 = new Reader01();
                Reader02 reader02 = new Reader02()
        ) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void readFile2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
