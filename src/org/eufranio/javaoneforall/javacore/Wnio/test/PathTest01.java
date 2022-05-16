package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("newFolder/fileRenamed.txt");

        System.out.println(p1.getFileName());
        System.out.println(p1.toAbsolutePath());
        System.out.println(p1.getRoot());
    }
}
