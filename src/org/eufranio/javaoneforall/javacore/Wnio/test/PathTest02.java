package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) {
        Path folderPath = Paths.get("folder2");

        try {
            if (Files.notExists(folderPath)) {
                Path directory = Files.createDirectory(folderPath);
            }

            Path newDirectories = Paths.get("./folder2/subjects/", "1", "3");

            Path directories = Files.createDirectories(newDirectories);

            Path olaMundoFile = Paths.get(newDirectories.toString(), "OlaMundo");
            
            if (Files.notExists(olaMundoFile)) {
                Files.createFile(olaMundoFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
