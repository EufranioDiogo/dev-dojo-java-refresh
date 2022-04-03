package org.eufranio.javaoneforall.Gassociation.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    {
        this.players = new ArrayList<>();
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player newPlayer) {
        this.players.add(newPlayer);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}
