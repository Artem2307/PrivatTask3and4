package Settings;

import java.util.Random;

public class GenerateRandomNumber {
    public static String number = generateRandomNumber();

    private static String generateRandomNumber() {
        Random random = new Random();
        int number = 10 + random.nextInt(9990);
        return String.valueOf(number);
    }
}
