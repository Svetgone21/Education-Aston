import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringsCollection = new ArrayList<>();
        stringsCollection.add("Highload");
        stringsCollection.add("High");
        stringsCollection.add("Load");
        stringsCollection.add("Highload");

        String firstElement = stringsCollection.isEmpty() ? "0" : stringsCollection.get(0);
        System.out.println("Первый элемент коллекции: " + firstElement);
    }
}