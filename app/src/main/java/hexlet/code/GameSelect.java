package hexlet.code;

import java.util.Random;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;

public class GameSelect {
    public static void game(int gameNumber) {
        Random random = new Random();
        int countGames = 3;
        String namePlayer = Greeting.getMame();
        System.out.println("Hello, " + namePlayer);
        switch (gameNumber) {
            case 2:
                Even.evenGame(random, countGames, namePlayer);
                break;
            case 3:
                Calc.calculator(random, countGames, namePlayer);
                break;
            default:
                break;
        }
    }
}
