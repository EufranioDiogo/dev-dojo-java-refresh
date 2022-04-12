package org.eufranio.javaoneforall.javacore.Minterfaces.domain;

public interface DataLoader {
    public static int MAX_LOADING_FILE_SIZE = 100000;

    public abstract void load();
    public default void checkPermission() {
        System.out.println("Checking permissions...");
    }

    public static void getMaxLoadingFileSize() {
        System.out.println(DataLoader.MAX_LOADING_FILE_SIZE);
    }
}
