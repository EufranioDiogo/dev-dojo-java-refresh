package org.eufranio.javaoneforall.javacore.cmethodoverloading.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String name, String type, int episodes, String status) {
        this.init(name, type, episodes);
        this.status = status;
    }
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Episodes: " + this.episodes);
        System.out.println("Status: " + this.status);
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
}