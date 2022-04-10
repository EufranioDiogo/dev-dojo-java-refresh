package org.eufranio.javaoneforall.javacore.Gassociation.domain;


public class Player {
    private String name;
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        if (this.team != null) {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", team=" + team.getName() +
                    '}';
        }
        return "Player{" +
                "name='" + name + '\'' +
                ", team=" + "null" +
                '}';
    }
}
