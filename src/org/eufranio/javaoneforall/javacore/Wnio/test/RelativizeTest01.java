package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/ed/Desktop");
        Path programming = Paths.get("/home/ed/Programing/WORK/Back/onde-backend");

        Path pathToProgramming = dir.relativize(programming);

        System.out.println(pathToProgramming);

        Path absolute1 = Paths.get("/home/ed");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/ed/Documents/SCHOOL");
        Path absolute4 = Paths.get("/bin");

        System.out.println("from: " + absolute3 + " to: " + absolute4 + " -> " +absolute3.relativize(absolute4));
        System.out.println("from: " + absolute1 + " to: " + absolute2 + " -> " +absolute1.relativize(absolute2));
        System.out.println("from: " + absolute4 + " to: " + absolute2 + " -> " +absolute4.relativize(absolute2));


    }
}
