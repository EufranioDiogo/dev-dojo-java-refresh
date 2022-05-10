package org.eufranio.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        try {
            File file = new File("ola.txt");

            boolean exists = file.exists();

            if (exists) {
                System.out.println("File already exists exist");

            } else {
                boolean newFile = file.createNewFile();

                if (newFile) {
                    System.out.println("File created");
                }
            }


            System.out.println("File getAbsolutePath: " + file.getAbsolutePath());
            System.out.println("File getPath: " + file.getPath());
            System.out.println("isFile: " + file.isFile());
            System.out.println("isDirectory: " + file.isDirectory());
            System.out.println("isHidden: " + file.isHidden());
            System.out.println("Permission: " +
                    permission(file.canRead(), "r") +
                    permission(file.canWrite(), "w") +
                    permission(file.canExecute(), "x"));

            LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.of("Africa/Luanda"));

            System.out.println("Last modified date: " + localDateTime);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static String permission(boolean hasPermission, String permissionLetter) {
        return hasPermission ? permissionLetter : "-";
    }
}
