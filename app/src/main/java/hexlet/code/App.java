package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.Gcd;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - Gcd\n"
                + "5 - Progression\n" +  "6 - Prime\n" + "0 - Exit");
        Scanner s = new Scanner(System.in);
        String game = s.next();
        System.out.println("Your choice: " + game + "\n");
        switch (game) {
            case "0":
                break;
            case "1":
                Greeting.getMame();
                break;
            case "2":
                Even.evengame();
                break;
            case "3":
                Calc.calculator();
                break;
            case "4":
                Gcd.gcdGame();
                break;
            case "5":
                Progression.progressionGame();
                break;
            case "6":
                Prime.primeGame();
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }
    }
}
