package org.eufranio.javaoneforall.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    // 0- Static init block is executed when JVM loads the class and only once
    // 1- Memory allocation
    // 2- Attributes default initialization
    // 3- Initialization block is executed
    // 4- The constructor is executed

    static {
        // will execute only once with static attributes
        System.out.println("Inside init block // initialization block is being executed first");
        Anime.episodes = new int[100];
        for (int i = 0; i < Anime.episodes.length; i++) {
            Anime.episodes[i] = i + 1;
            System.out.print(Anime.episodes[i] + " ");
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

    public static int[] getEpisodes() {
        return episodes;
    }

    public static void setEpisodes(int[] episodes) {
        Anime.episodes = episodes;
    }
}
