package hexlet.code;

import java.util.Random;
import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

public class Engine {
    public static void game(int gameNumber) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        int countGames = 3;
        String namePlayer = Greeting.getMame();
        System.out.println("Hello, " + namePlayer);
        switch (gameNumber) {
            case 2:
                Even.evenGame(random, countGames, namePlayer, s);
                break;
            case 3:
                Calc.calculator(random, countGames, namePlayer, s);
                break;
            case 4:
                Gcd.gcdGame(random, countGames, namePlayer, s);
                break;
            case 5:
                Progression.progressionGame(random, countGames, namePlayer, s);
                break;
            default:
                break;
        }
    }
}
