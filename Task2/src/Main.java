import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String info = new Scanner(System.in).nextLine();
        System.out.println(output(info));
    }

    public static String output(String info) {
        info = info.replaceAll("[0-9,./:()';+–-]","");
        return info.replaceAll("\\s+","\n");
    }

}