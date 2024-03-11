import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] stringsArray = {"f10", "a15", "f2", "f4", "f5", "b54", "a16"};
        Arrays.sort(stringsArray, (a, b) -> {
            String[] splitA = a.split("(?<=\\D)(?=\\d)");
            String[] splitB = b.split("(?<=\\D)(?=\\d)");
            int diff = splitA[0].compareTo(splitB[0]);
            return diff != 0 ? diff : Integer.compare(Integer.parseInt(splitA[1]), Integer.parseInt(splitB[1]));
        });
        for (String str : stringsArray) {
            System.out.println(str);
        }
    }
}