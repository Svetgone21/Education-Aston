import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringsCollection = new ArrayList<>();
        stringsCollection.add("Highload");
        stringsCollection.add("High");
        stringsCollection.add("Load");
        stringsCollection.add("Highload");

        int count = Collections.frequency(stringsCollection, "High");
        System.out.println("Количество вхождений объекта \"High\" в коллекцию: " + count);
    }
}