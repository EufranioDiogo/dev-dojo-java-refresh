package org.eufranio.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        Scanner scanner = new Scanner(System.in);

        try (
                FileReader fileReader = new FileReader(file);
        ) {
            /*char[] text = new char[300];
            int read = fileReader.read(text);

            for (char c : text) {
                System.out.print(c + "");
            }*/
            int i = 0;

            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
