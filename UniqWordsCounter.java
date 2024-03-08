import java.util.HashMap;
import java.util.Map;

public class UniqWordsCounter {
    public static void main(String[] args) {
        String[] wordsArray = {"Potato", "Tomato", "Carrot", "Cabbage", "Cabbage", "Tomato", "Potato", "Cabbage", "Tomato", "Potato"};

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : wordsArray) {
            if (wordFrequencyMap.containsKey(word)) {
                wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
            } else {
                wordFrequencyMap.put(word, 1);
            }
        }

        System.out.println("Уникальные слова и их частота встречаемости:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}