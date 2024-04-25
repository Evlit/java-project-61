package hexlet.code;

public class Check {
    public static String isCorrect(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
