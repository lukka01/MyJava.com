import java.awt.*;
import java.util.Random;

public class Roulette {
    public static void main(String[] args) {
        int[] gameCounts = {1, 10, 100, 1000, 10000 };
        Random random = new Random();
        int totalPockets = 38;


        for (int games: gameCounts) {
            double totalWin = 0;

            for (int i = 0; i < games; i++) {
                int bet = random.nextInt(totalPockets); // Bet on a random pocket
                int outcome = random.nextInt(totalPockets);
                int money = 100;// Outcome is a random pocket

                if (bet == outcome) totalWin += 35*money;
                else totalWin -= money;
            }
            double averageWin = totalWin/games;
            System.out.println("After " + games + " games:");
            System.out.println("Total Win: " + totalWin + " GEL");
            System.out.println("Average Win per Game: " + averageWin + " GEL");
            System.out.println();


        }



    }







}
