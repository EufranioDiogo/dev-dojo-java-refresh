package org.eufranio.javaoneforall.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListFilesByPattern extends SimpleFileVisitor<Path> {
    private final String glob;

    public ListFilesByPattern(String glob) {
        this.glob = glob;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (this.matchesGlob(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    private boolean matchesGlob(Path path) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(this.glob);

        return pathMatcher.matches(path);
    }

}
public class PathMatcherTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");

        Files.walkFileTree(root, new ListFilesByPattern("glob:**/*Test*.{java,class}"));
    }

}
