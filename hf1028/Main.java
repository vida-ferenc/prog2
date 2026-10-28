import java.util.Scanner;

class PyUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}

class StringUtils {
    public static String randomCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Math.random() < 0.5) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }

        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String text = PyUtils.input("Text: ");
        String randomCaseText = StringUtils.randomCase(text);
        System.out.println(randomCaseText);
    }
}