package org.eufranio.javaoneforall.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        try {
            ExceptionTest02.customFileCreator();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void customFileCreator() throws IOException {
        File file = new File("folder/h.js ");

        try {
            boolean fileIsCreated = file.createNewFile();
            System.out.println("File created: " + fileIsCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
            // throw new RuntimeException("Something happened when creating the file");
        }
    }
}
