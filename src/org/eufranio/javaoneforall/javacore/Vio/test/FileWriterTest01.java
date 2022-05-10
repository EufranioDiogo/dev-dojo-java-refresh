package org.eufranio.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        Scanner scanner = new Scanner(System.in);

        try (
                FileWriter fileWriter = new FileWriter(file);
                ) {
            String line = "";

            while(!line.equalsIgnoreCase("exit")) {
                line = scanner.nextLine();
                fileWriter.write(line + "\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
