package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getMame() {
        Scanner s = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = s.nextLine();
        while (name.equals("")) {
            System.out.println("The name can't be blank! Enter again!");
            name = s.nextLine();
        }
        return name;
    }
}
