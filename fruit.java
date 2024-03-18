public class Fruit {
    private String name;
    private String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Apple extends Fruit {
    private String variety;

    public Apple(String name, String color, String variety) {
        super(name, color);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}

public class Orange extends Fruit {
    private int seedCount;

    public Orange(String name, String color, int seedCount) {
        super(name, color);
        this.seedCount = seedCount;
    }

    public int getSeedCount() {
        return seedCount;
    }

    public void setSeedCount(int seedCount) {
        this.seedCount = seedCount;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Apple and Orange
        Apple apple = new Apple("Apple", "Red", "Gala");
        Orange orange = new Orange("Orange", "Orange", 10);

        // Access and display properties
        System.out.println("Apple: " + apple.getName() + ", Color: " + apple.getColor() + ", Variety: " + apple.getVariety());
        System.out.println("Orange: " + orange.getName() + ", Color: " + orange.getColor() + ", Seed Count: " + orange.getSeedCount());
    }
}