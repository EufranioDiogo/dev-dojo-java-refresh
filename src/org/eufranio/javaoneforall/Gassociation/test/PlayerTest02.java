package org.eufranio.javaoneforall.Gassociation.test;

import org.eufranio.javaoneforall.Gassociation.domain.Player;
import org.eufranio.javaoneforall.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Team team = new Team("White Birds");
        Player player01 = new Player("Ronaldo");
        Player player02 = new Player("Messi");
        Player player03 = new Player("Pele");

        Player[] players = {player01, player02, player03};


        for (Player player :
                players) {
            System.out.println(player);
            team.addPlayer(player);
        }

        for (int i = 0; i < players.length; i++) {
            players[i].setTeam(team);
        }

        System.out.println(team);

        for (Player player :
                players) {
            System.out.println(player);
        }
    }
}
