package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ListAllJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        String regex = "([a-zA-Z\\d])+\\.java";
        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher = pattern1.matcher(file.getFileName().toString());

        if (matcher.matches()) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");



        Files.walkFileTree(root, new ListAllJavaFiles());
    }
}
