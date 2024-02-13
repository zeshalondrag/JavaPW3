import java.util.Arrays;
import java.util.Scanner;

public class JavaPW3 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите слово: ");
            String name = sc.nextLine();
            name = name.replaceAll("\\s", "").toLowerCase();

            char[] after = new char[name.length()];

            for (int i = 0; i < name.length(); i++) {
                after[i] = name.charAt(i);
            }

            char[] before = new char[name.length()];

            for (int i = 0; i < name.length(); i++) {
                before[i] = after[after.length - 1 - i];
            }

            if (Arrays.equals(after, before)) {
                System.out.println("Ваше слово является палиндромом!");
            }
            else {
                System.out.println("Ваше слово не является палиндромом :(");
                break;
            }
        }
    }
}