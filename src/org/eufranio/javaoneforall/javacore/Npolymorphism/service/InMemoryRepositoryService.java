package org.eufranio.javaoneforall.javacore.Npolymorphism.service;

import org.eufranio.javaoneforall.javacore.Npolymorphism.repository.Repository;

public class InMemoryRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving on memory...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from memory...");
    }

    @Override
    public void find() {
        System.out.println("Finding data from memory...");
    }
}
