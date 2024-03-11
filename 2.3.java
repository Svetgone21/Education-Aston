import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringsCollection = new ArrayList<>();
        stringsCollection.add("Highload");
        stringsCollection.add("High");
        stringsCollection.add("Load");
        stringsCollection.add("Highload");

        String lastElement = stringsCollection.isEmpty() ? "0" : stringsCollection.get(stringsCollection.size() - 1);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}