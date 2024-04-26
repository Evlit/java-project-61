package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
               + "1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - Gcd\n"
               + "0 - Exit");
        Scanner s = new Scanner(System.in);
        try {
            int game = s.nextInt();
            if (game == 0) {
                System.out.println("Goodbye");
            } else if (game > 0 && game <= 4) {
                GameSelect.game(game);
            } else {
                System.out.println("Incorrect input");
            }
        } catch (InputMismatchException err) {
            System.out.println("Type a number, not a text");
        }
    }
}
