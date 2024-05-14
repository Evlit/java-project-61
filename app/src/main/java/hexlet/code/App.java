package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                          Please enter the game number and press Enter.
                          1 - Greet
                          2 - Even
                          3 - Calc
                          4 - Gcd
                          5 - Progression
                          6 - Prime
                          0 - Exit
                          """);
        Scanner sGame = new Scanner(System.in);
        String game = sGame.next();
        System.out.println("Your choice: " + game + "\n");
        switch (game) {
            case "0" -> { }
            case "1" ->  Cli.getMame();
            case "2" ->  Even.evenGame();
            case "3" ->  Calc.calculator();
            case "4" ->  Gcd.gcdGame();
            case "5" ->  Progression.progressionGame();
            case "6" ->  Prime.primeGame();
            default -> System.out.println("Incorrect input");
        }
    }
}
