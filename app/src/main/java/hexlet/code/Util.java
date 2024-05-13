package hexlet.code;

import java.util.Random;

public class Util {
    public static int getRandom(int number) {
        Random random = new Random();
        int newRandom = random.nextInt(number);
        return newRandom;
    }

    public static int getRandom(int position, int number) {
        Random random = new Random();
        int newRandom = random.nextInt(position, number);
        return newRandom;
    }
}
