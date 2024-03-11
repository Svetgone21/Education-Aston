import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> logins = new ArrayList<>();

        System.out.println("Введите логины (для завершения введите пустую строку):");
        while (true) {
            String login = scanner.nextLine();
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }

        System.out.println("Логины, начинающиеся с буквы 'f':");
        logins.stream()
                .filter(login -> login.startsWith("f"))
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}