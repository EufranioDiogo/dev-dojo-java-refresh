package org.eufranio.javaoneforall.javacore.cmethodoverloading.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;
    private String studioName;


    public Anime() {
        System.out.println("Criando objecto");
    }

    public Anime(String name, String type, int episodes, String status) {
        this();
        this.init(name, type, episodes);
        this.status = status;
    }

    public Anime(String name, String type, int episodes, String status, String studioName) {
        this(name, type, episodes, status);
        this.studioName = studioName;
    }

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String name, String type, int episodes, String status) {
        System.out.println("OLa mund");
        this.init(name, type, episodes);
        this.status = status;
    }
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Episodes: " + this.episodes);
        System.out.println("Status: " + this.status);
        System.out.println("Studio: " + this.studioName);
    }
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }
}