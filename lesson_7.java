
public class Main {
public class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}
public class MyArrayProcessor {
    public void process(String[][] inputArray) throws MyArraySizeException {
        if (inputArray.length != 4 || inputArray[0].length != 4) {
        }
        public class ArraySummation {
            public static int sumArrayElements(String[] arr) throws MyArrayDataException {
                int totalSum = 0;
                for (int i = 0; i < arr.length; i++) {
                    try {
                        int num = Integer.parseInt(arr[i]);
                        totalSum += num;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Invalid data in cell " + i);
                    }
                }
                return totalSum;
            }
        }

    }

        public static void main(String[] args) {
            String[] arr = {"10", "20", "30", "40", "50"};

            try {
                int result = ArraySummation.sumArrayElements(arr);
                System.out.println("Сумма элементов массива: " + result);
            } catch (MyArraySizeException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (MyArrayDataException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }