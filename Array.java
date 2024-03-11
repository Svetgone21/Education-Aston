import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringsCollection = new ArrayList<>();
        
        stringsCollection.add("Highload");
        stringsCollection.add("High");
        stringsCollection.add("Load");
        stringsCollection.add("Highload");
        for (String str : stringsCollection) {
            System.out.println(str);
        }
    }
}