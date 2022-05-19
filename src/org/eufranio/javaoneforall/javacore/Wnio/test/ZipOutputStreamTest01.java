package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("folder/folder.zip");
        Path content = Paths.get("folder");

        zip(zipFile, content);
    }

    private static void zip(Path zipFile, Path sourceFiles) {
        try (
                DirectoryStream<Path> directory = Files.newDirectoryStream(sourceFiles);
                ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile))
        ) {
            for (Path file :
                    directory) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(file, zipOutputStream);
                zipOutputStream.closeEntry();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
