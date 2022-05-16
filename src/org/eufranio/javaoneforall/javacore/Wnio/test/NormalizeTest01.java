package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directory = "folder2/subjects/./1/3";
        String fileOlaMundo = "../../olaMundo.txt";

        Path path1 = Paths.get(directory, fileOlaMundo);
        Path path2 = path1.normalize();

        System.out.println(path1);
        System.out.println(path2);

    }
}
