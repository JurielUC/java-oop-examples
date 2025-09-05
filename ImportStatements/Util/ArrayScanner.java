package ImportStatements.Util;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Scanner;
import java.util.*;

/** Using ArrayList (Collections framework) and Scanner (user input). */
public class ArrayScanner {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        /** Adding the names manually */
        // List<Integer> names = new ArrayList<>();
        // names.add(10);
        // names.add(11);
        // names.add(12);

        // ["Alice", "Bob", "Charlie", "Juriel", "John"]

        /** Initialize with Arrays.asList() */
        // List<Integer> names = new ArrayList<>(Arrays.asList(13, 45, 76));

        /** Use List.of() (Java 9+) */
        // List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Age: " + age);  
        sc.close();
    }
}
