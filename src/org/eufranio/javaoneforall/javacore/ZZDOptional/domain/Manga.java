package org.eufranio.javaoneforall.javacore.ZZDOptional.domain;

import java.util.concurrent.ThreadLocalRandom;

public class Manga {
    private final Integer id;
    private String title;
    private Long episoddes;

    public Manga() {
        this.id = ThreadLocalRandom.current().nextInt();
    }

    public Manga(Integer id, String title, Long episoddes) {
        this.id = id;
        this.title = title;
        this.episoddes = episoddes;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getEpisoddes() {
        return episoddes;
    }

    public void setEpisoddes(Long episoddes) {
        this.episoddes = episoddes;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", episoddes=" + episoddes +
                '}';
    }
}
