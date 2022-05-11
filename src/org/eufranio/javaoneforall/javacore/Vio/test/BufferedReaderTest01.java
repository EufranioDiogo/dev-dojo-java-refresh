package org.eufranio.javaoneforall.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        Scanner scanner = new Scanner(System.in);

        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                ) {

            String line;

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
