public class Main{
    public static void main(String [] args)
    {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

   public static void printThreeWords(){
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");

   }


   public static void checkSumSign(){
    int a = 1;
    int b = 3;
    int sum = a + b;
    if (sum >= 0) {
      System.out.println("Сумма положительная");
    }  else {
       System.out.println("Сумма отрицательная");
    }
}


     public void printColor(){
        int value = 99;
    if (value < 0) {
     System.out.println("Красный");
    } else if (value >= 0 && value <= 100) {
       System.out.println("Желтый");
    } else {
        System.out.println("Зеленый");
    }
}
  public void compareNumbers() {
    int a = 6;
    int b = 5;
    if (a >= b) {
        System.out.println("a >= b");
    } else {
        System.out.println("a < b");
    }
}
   }


