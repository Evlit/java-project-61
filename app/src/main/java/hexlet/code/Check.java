package hexlet.code;

public class Check {
    public static String checkEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }

    public static String checkCalc(int numberA, int numberB, String operator) {
        int result;
        switch (operator) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            default:
                result = numberA * numberB;
                break;
        }
        return result + "";
    }

    public static void failed(String trueAnswer, String badAnswer, String name) {
        System.out.println("'" + badAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + trueAnswer + "'" + ".");
        System.out.println("Let's try again, " + name + "!");
    }
}
