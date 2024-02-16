public class main 
{
   public static void printThreeWords( String [] args)
   {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");

   }
   public static void checkSumSign( int a, int b)
   {
    int sum = a + b;
    if (sum >= 0) {
      System.out.println("Сумма положительная");
    }  else {
       System.out.println("Сумма отрицательная");

    }
}
     public void printColor(int value) 
    {
    if (value < 0) {
     System.out.println("Красный");
    } else if (value >= 0 && value <= 100) {
       System.out.println("Желтый");
    } else {
        System.out.println("Зеленый");
    }
}
  public void compareNumbers() 
  {
    int a = 6;
    int b = 5;
    if (a >= b) {
        System.out.println("a >= b");
    } else {
        System.out.println("a < b");
    }
}
   }


