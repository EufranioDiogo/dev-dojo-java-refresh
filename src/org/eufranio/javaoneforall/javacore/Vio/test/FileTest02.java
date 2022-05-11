package org.eufranio.javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileTest02 {
    public static void main(String[] args) {
        try {
            File folder = new File("newFolder");
            boolean isFolderCreated = folder.mkdir();
            System.out.println("isFolderCreated: " + isFolderCreated);

            File file = new File(folder, "file.txt");
            boolean isFileCreated = file.createNewFile();

            System.out.println("isFileCreated: " + isFileCreated);

            File fileRenamed = new File(folder, "fileRenamed.txt");
            boolean isFileIsRenamed = file.renameTo(fileRenamed);

            System.out.println("isFileRenamed: " + isFileIsRenamed);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static String permission(boolean hasPermission, String permissionLetter) {
        return hasPermission ? permissionLetter : "-";
    }
}
