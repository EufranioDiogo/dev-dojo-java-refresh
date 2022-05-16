package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("folder/newFile.js");

        if (Files.notExists(file)) {
            Files.createFile(file);
        }

        PosixFileAttributes posixFileAttributes = Files.readAttributes(file, PosixFileAttributes.class);
        PosixFileAttributeView posixFileAttributeView = Files.getFileAttributeView(file, PosixFileAttributeView.class);

        System.out.println(posixFileAttributes.permissions());

        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rwxr-----");
        posixFileAttributeView.setPermissions(posixFilePermissions);

        System.out.println(Files.readAttributes(file, PosixFileAttributes.class).permissions());
    }
}
