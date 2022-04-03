package org.eufranio.javaoneforall.Gassociation.test;

import org.eufranio.javaoneforall.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player01 = new Player("Ronaldo");
        Player player02 = new Player("Messi");
        Player player03 = new Player("Pele");

        Player[] players = {player01, player02, player03};

        for (Player player :
                players) {
            System.out.println(player);
        }
    }
}
