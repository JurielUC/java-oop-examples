package ImportStatements.Util;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Scanner;
import java.util.*;

/** Using ArrayList (Collections framework) and Scanner (user input). */
public class ArrayScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /** Adding the names manually */
        // List<String> names = new ArrayList<>();
        // names.add("Alice");
        // names.add("Bob");
        // names.add("Charlie");

        // ["Alice", "Bob", "Charlie", "Juriel", "John"]

        /** Initialize with Arrays.asList() */
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        /** Use List.of() (Java 9+) */
        // List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "Juriel"));

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        names.add(name);

        System.out.println("names: " + names);
        sc.close();
    }
}
