package org.eufranio.javaoneforall.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        ExceptionTest01.customFileCreator();
    }

    private static void customFileCreator() {
        File file = new File("folder/mathFunctions.js ");

        try {
            boolean fileIsCreated = file.createNewFile();
            System.out.println("File created: " + fileIsCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
