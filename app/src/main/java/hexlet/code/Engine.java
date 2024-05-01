package hexlet.code;

import java.util.Random;
import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    public static void game(int gameNumber) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        final int countGames = 3;
        final int gameNumber2 = 2;
        final int gameNumber3 = 3;
        final int gameNumber4 = 4;
        final int gameNumber5 = 5;
        final int gameNumber6 = 6;
        String namePlayer = Greeting.getMame();
        System.out.println("Hello, " + namePlayer + "!");
        switch (gameNumber) {
            case gameNumber2:
                Even.evenGame(random, countGames, namePlayer, s);
                break;
            case gameNumber3:
                Calc.calculator(random, countGames, namePlayer, s);
                break;
            case gameNumber4:
                Gcd.gcdGame(random, countGames, namePlayer, s);
                break;
            case gameNumber5:
                Progression.progressionGame(random, countGames, namePlayer, s);
                break;
            case gameNumber6:
                Prime.primeGame(random, countGames, namePlayer, s);
                break;
            default:
                break;
        }
    }
}
