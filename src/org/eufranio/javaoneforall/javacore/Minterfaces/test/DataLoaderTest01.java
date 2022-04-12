package org.eufranio.javaoneforall.javacore.Minterfaces.test;

import org.eufranio.javaoneforall.javacore.Minterfaces.domain.DBLoader;
import org.eufranio.javaoneforall.javacore.Minterfaces.domain.DataLoader;
import org.eufranio.javaoneforall.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DBLoader databaseLoader = new DBLoader();
        FileLoader fileLoader = new FileLoader();


        databaseLoader.load();
        databaseLoader.remove();

        fileLoader.load();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();


        System.out.println("Data My MAX_LOADING_FILE_SIZE: " + DataLoader.MAX_LOADING_FILE_SIZE);

    }
}
