package DiceGameProject;

import java.util.Random;

public class Players {

    private final String name;
    private int points;

    Players(String name) {
        this.name = name;

    }
    public void rollDice() {
        Random dice = new Random();
        int roll = dice.nextInt(6) + 1;
        points += roll;

        System.out.println(name+" rolls a "+roll+" and now has "+points+" points");
    }

    public static void printResult(Players p1, Players p2) {
        if (p1.points > p2.points)
            System.out.println(p1.name +" wins with "+p1.points+ " points");
        else if (p2.points > p1.points)
            System.out.println(p2.name +" wins with "+p2.points+ " points");
        else
            System.out.println("Draw");
    }

}