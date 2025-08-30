package PlaceholderSample;

public class PlaceholderSample {
    public static void main(String[] args) { 
        int age = 27; 
        float height = 1.54f; 
        char grade = 'A'; 
        String name = "John Doe"; 
 
        System.out.println("Age: " + age); 
        System.out.println("Height: " + String.format("%.2f meters", height)); 
        System.out.println("Grade: " + grade); 
        System.out.println("Name: " + name); 
    } 
}