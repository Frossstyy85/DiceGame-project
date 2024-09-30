package DiceGameProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for player 1: ");
        Players player1 = new Players(scanner.nextLine());

        System.out.print("Enter name for player 2: ");
        Players player2 = new Players(scanner.nextLine());


        for (int i = 0; i < 2; i++) {

            System.out.println("Press enter to continue to round "+(i+1));
            scanner.nextLine();
            player1.rollDice();
            player2.rollDice();
        }

        System.out.println("Press enter to view results");
        scanner.nextLine();
        Players.printResult(player1,player2);

    }
}