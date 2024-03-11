import java.util.Arrays;

public class Main {
    private static final int YEAR_OF_CONSCRIPTION = 2024;
    
    private static Collection<Student> students = Arrays.asList(
        new Student("Дмитрий", 17, Gender.MAN),
        new Student("Максим", 20, Gender.MAN),
        new Student("Екатерина", 20, Gender.WOMAN),
        new Student("Михаил", 28, Gender.MAN)
    );

    public static void main(String[] args) {
        int conscriptionAgeLowerBound = 18;
        int conscriptionAgeUpperBound = 27;

        for (Student student : students) {
            if (student.getAge() >= conscriptionAgeLowerBound && student.getAge() <= conscriptionAgeUpperBound) {
                System.out.println(student.getName() + " грозит получение повестки в 2024 году.");
            }
        }
    }
}