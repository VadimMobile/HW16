import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер");
        String input = new Scanner(System.in).nextLine().trim();
        System.out.println(input.replaceAll("\\D+", ""));
        if (input.length() == 11) {
            input = input.replaceAll("^\\d", "7");
            System.out.println(input);
        } else if (input.length() == 10) {
            input = "7" + input;
            System.out.println(input);
        } else {
            System.out.println("Неверный формат номера");
        }
    }
}