package org.eufranio.javaoneforall.javacore.Npolymorphism.service;

import org.eufranio.javaoneforall.javacore.Npolymorphism.repository.Repository;

public class FileRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving on file...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from file...");
    }

    @Override
    public void find() {
        System.out.println("Finding data from file...");
    }
}
