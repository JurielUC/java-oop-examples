package Encapsultation.Password;

public class Main {
    public static void main(String[] args) {
        User user = new User("12345678");

        // Safe access through method
        System.out.println("Trying correct password: " + user.checkPassword("12345678"));
        System.out.println("Trying wrong password: " + user.checkPassword("wrongpass"));

        // Direct access will fail (uncomment to see the error)
        // System.out.println(user.password);  // <- Compile-time error

        // Controlled password change
        user.setPassword("12345678", "newpass123");  // Succeeds
        user.setPassword("wrongpass", "hacked");      // Fails
    }
}

