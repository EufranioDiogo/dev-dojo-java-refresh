package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(10);
        File file = new File("folder/helloWorld.js");

        boolean newFile = file.setLastModified(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path file2 = Paths.get("folder/mathFunctions.js");


        Files.setLastModifiedTime(file2, FileTime.from(localDateTime.toInstant(ZoneOffset.UTC)));
        System.out.println(Files.isExecutable(file2));
        System.out.println(Files.isWritable(file2));
        System.out.println(Files.isRegularFile(file2));
    }
}
