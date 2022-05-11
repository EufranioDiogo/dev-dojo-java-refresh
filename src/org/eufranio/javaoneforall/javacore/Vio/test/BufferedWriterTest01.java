package org.eufranio.javaoneforall.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        Scanner scanner = new Scanner(System.in);

        try (
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                ) {
            String line = "";

            System.out.println("Start typing your text, and type exit to close");
            while(!line.equalsIgnoreCase("exit")) {
                line = scanner.nextLine();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
