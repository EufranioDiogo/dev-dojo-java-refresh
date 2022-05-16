package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path file2 = Paths.get("folder/newFile.js");

        //BasicFileAttributes basicFileAttributes = Files.readAttributes(file2, BasicFileAttributes.class);
        BasicFileAttributes basicFileAttributes = Files.readAttributes(file2, BasicFileAttributes.class);


        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime modifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime fileTime = basicFileAttributes.lastAccessTime();



        System.out.println("creationTime: " + creationTime);
        System.out.println("modifiedTime: " + modifiedTime);
        System.out.println("fileTime: " + fileTime);


        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(file2, BasicFileAttributeView.class);

        LocalDateTime futureDate = LocalDateTime.now().plusDays(2).plusMinutes(35).plusHours(36);

        fileAttributeView.setTimes(FileTime.from(futureDate.toInstant(ZoneOffset.UTC)), FileTime.from(futureDate.toInstant(ZoneOffset.UTC)), FileTime.from(futureDate.toInstant(ZoneOffset.UTC)));

        creationTime = fileAttributeView.readAttributes().creationTime();
        modifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        fileTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("---------------------------------------");


        System.out.println("creationTime: " + creationTime);
        System.out.println("modifiedTime: " + modifiedTime);
        System.out.println("fileTime: " + fileTime);
    }
}
