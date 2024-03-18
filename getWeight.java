import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    // Constructor
    public Box() {
        this.fruits = new ArrayList<>();
    }

    // Add fruit to the box
    public void addFruit(T fruit) {
        if (fruits.isEmpty() || fruit.getClass() == fruits.get(0).getClass()) {
            fruits.add(fruit);
            System.out.println(fruit.getName() + " added to the box");
        } else {
            System.out.println("Cannot add " + fruit.getName() + " to the box of " + fruits.get(0).getName());
        }
    }

    // Get the total weight of fruits in the box
    public double getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        } else {
            double weight = 0;
            if (fruits.get(0) instanceof Apple) {
                weight = fruits.size() * 1.0f;  // Weight of each apple is 1.0f
            } else if (fruits.get(0) instanceof Orange) {
                weight = fruits.size() * 1.5f;  // Weight of each orange is 1.5f
            }
            return weight;
        }
    }

    public void transferTo(Box<T> otherBox) {
        if (this.fruits.isEmpty()) {
            System.out.println("No fruits to transfer");
        } else if (otherBox.fruits.isEmpty() || otherBox.fruits.get(0).getClass() == this.fruits.get(0).getClass()) {
            otherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
            System.out.println("Fruits transferred successfully");
        } else {
            System.out.println("Cannot transfer fruits to the box of " + otherBox.fruits.get(0).getName());
        }
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple("Apple", "Red", "Gala");
        Apple apple2 = new Apple("Apple", "Green", "Granny Smith");
        Orange orange1 = new Orange("Orange", "Orange", 10);
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        orangeBox.addFruit(orange1);

        System.out.println("Apple Box Weight: " + appleBox.getWeight());
        System.out.println("Orange Box Weight: " + orangeBox.getWeight());

        appleBox.transferTo(orangeBox);  
        orangeBox.transferTo(appleBox); 
    }
}
