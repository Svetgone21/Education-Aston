import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] числа = new int[10]; 
        Random random = new Random();
        int четные_числа = 0;

        System.out.print("Сгенерированные числа: ");
        for (int i = 0; i < числа.length; i++) {
            числа[i] = random.nextInt(100); // Генерация случайных чисел от 0 до 99
            System.out.print(числа[i] + " ");

            if (числа[i] % 2 == 0) {
                четные_числа++;
            }
        }

        System.out.println("\nКоличество четных чисел: " + четные_числа);
    }
}
