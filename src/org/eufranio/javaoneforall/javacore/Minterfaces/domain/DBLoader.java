package org.eufranio.javaoneforall.javacore.Minterfaces.domain;

public class DBLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading the system...");
    }

    @Override
    public void remove() {

    }
}
