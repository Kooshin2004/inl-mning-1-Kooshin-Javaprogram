package se.iths.kooshin.tarningspel;

import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {


        String fName1 = IO.readln("Ange förnamn för spelare 1: ");
        String lName1= IO.readln("Ange efternamn för spelare 1: ");


        Player player1 = new Player(fName1, lName1);

        String fName2 = IO.readln("Ange förnamn för spelare 1: ");
        String lName2= IO.readln("Ange efternamn för spelare 1: ");

        Player player2 = new Player(fName2, lName2);

        System.out.println(" Spelet startar!");

        int roll1 = RandomGenerator.getDefault().nextInt(1, 7);
        System.out.println(player1.getFullName() + " slog: " + roll1);
        player1.addToScore(roll1);

        int roll2 = RandomGenerator.getDefault().nextInt(1, 7);
        System.out.println(player1.getFullName() + " slog: " + roll2);
        player1.addToScore(roll2);

        int roll3 = RandomGenerator.getDefault().nextInt(1, 7);
        System.out.println(player2.getFullName() + " slog: " + roll3);
        player2.addToScore(roll3);

        int roll4 = RandomGenerator.getDefault().nextInt(1, 7);
        System.out.println(player2.getFullName() + " slog: " + roll4);
        player2.addToScore(roll4);

        System.out.println("Resultat");
        System.out.println(player1.getFullName() + " fick totalt: " + player1.getScore());
        System.out.println(player2.getFullName() + " fick totalt: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Vinnare: " + player1.getFullName());
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Vinnare: " + player2.getFullName());
        } else {
            System.out.println("Det blev oavgjort.");
        }


    }
}
