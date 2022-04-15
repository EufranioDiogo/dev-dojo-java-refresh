package org.eufranio.javaoneforall.javacore.Npolymorphism.service;

import org.eufranio.javaoneforall.javacore.Npolymorphism.repository.Repository;

public class DatabaseRepositoryService implements Repository {
    private String name;
    public final String ID;

    public DatabaseRepositoryService(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("Saving on data base...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database...");
    }

    @Override
    public void find() {
        System.out.println("Finding data from database...");
    }
}
