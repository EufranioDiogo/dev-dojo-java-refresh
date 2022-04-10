package org.eufranio.javaoneforall.javacore.Einitializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;

    // 1- Memory allocation
    // 2- Attributes default initialization
    // 3- Initialization block is executed
    // 4- The constructor is executed

    {
        System.out.println("Inside init block // initialization block is being executed first");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    {
        System.out.println("Init block 2");
    }

    public Anime() {
        System.out.println("Constructor with default episodes quantity");
    }

    public Anime(String name) {
        System.out.println("Constructor with name");
        this.setName(name);

    }



    public Anime(int length) {
        System.out.println("Constructor with specific episodes quantity");

    }
    public Anime(String name, int length) {
        System.out.println("Constructor with specific episodes quantity");
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }
}
