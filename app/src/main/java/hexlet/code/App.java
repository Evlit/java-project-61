package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - Gcd\n"
                + "5 - Progression\n" + "6 - Prime\n" + "0 - Exit");
        Scanner s = new Scanner(System.in);
        try {
            int game = s.nextInt();
            if (game != 0) {
                if (game > 0 && game <= 6) {
                    Engine.game(game);
                } else {
                    System.out.println("Incorrect input");
                }
            }
        } catch (InputMismatchException err) {
            System.out.println("Type a number, not a text");
        }
    }
}
