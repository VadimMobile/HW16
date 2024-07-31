import java.util.Scanner;

public class Main {
    public static final String CORRECT_CHARS = "([А-яё -]+\\s+){2}([А-яё -]+)";

    public static void main(String[] args) {
        System.out.println("Введите ФИО");
        String input = new Scanner(System.in).nextLine().trim();

        if (input.matches(CORRECT_CHARS)) {
            System.out.println("Фамилия: " + input.replaceAll("\\s.*", "") +
                    "\nИмя: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')) +
                    "\nОтчество: " + input.substring(input.lastIndexOf(' ')));
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}