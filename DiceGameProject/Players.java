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

        System.out.printf("%s rolls a %d and now has a total of %d points %n", name, roll, points);
    }

    public static void printResult(Players p1, Players p2) {
        if (p1.points > p2.points)
            System.out.printf("%s wins with %d points%n",p1.name,p1.points);
        else if (p2.points > p1.points)
            System.out.printf("%s wins with %d points%n",p2.name, p2.points);
        else
            System.out.println("Draw");
    }

}