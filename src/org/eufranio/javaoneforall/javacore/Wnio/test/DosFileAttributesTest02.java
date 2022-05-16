package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class DosFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path file2 = Paths.get("folder/newFile.js");

        if (Files.notExists(file2)) {
            Files.createFile(file2);
        }
        Files.setAttribute(file2, "dos:hidden", true);

        System.out.println(Files.isReadable(file2));
    }
}
