package org.eufranio.javaoneforall.javacore.Npolymorphism.test;

import org.eufranio.javaoneforall.javacore.Npolymorphism.repository.Repository;
import org.eufranio.javaoneforall.javacore.Npolymorphism.service.DatabaseRepositoryService;
import org.eufranio.javaoneforall.javacore.Npolymorphism.service.FileRepositoryService;
import org.eufranio.javaoneforall.javacore.Npolymorphism.service.InMemoryRepositoryService;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository dbService = new DatabaseRepositoryService("IS93K");
        Repository fileIoService = new FileRepositoryService();
        Repository inMemoryService = new InMemoryRepositoryService();
        DatabaseRepositoryService databaseRepositoryService = new DatabaseRepositoryService("msk");


        databaseRepositoryService.setName("291w2W");
        dbService.find();
        fileIoService.find();
        inMemoryService.find();
    }
}
