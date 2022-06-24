package org.eufranio.javaoneforall.javacore.ZZClambdas.domain;

public class Anime {
    private String title;
    private int episode;

    public Anime(String title, int episode) {
        this.title = title;
        this.episode = episode;
    }

    public String getTitle() {
        return title;
    }

    public Anime setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getEpisode() {
        return episode;
    }

    public Anime setEpisode(int episode) {
        this.episode = episode;
        return this;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episode=" + episode +
                '}';
    }
}
