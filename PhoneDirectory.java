import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> Directory;

    public PhoneDirectory() {
        Directory = new HashMap<>();
    }

    public void add(String surname, String number) {
        List<String> Phone = Directory.getOrDefault(фамилия, new ArrayList<>());
        Phone.add(number);
        Directory.put(surname, Phone);
    }

    public List<String> get(String surname) {
        return Directory.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneDirectory Directory = new PhoneDirectory();
        Directory.add("Иванов", "123456789");
        Directory.add("Петров", "987654321");
        Directory.add("Иванов", "111111111");

        System.out.println("Phone Иванова: " + Directory.get("Иванов"));
        System.out.println("Phone Петрова: " + Directory.get("Петров"));
        System.out.println("Phone Сидорова: " + Directory.get("Сидоров"));
    }
}