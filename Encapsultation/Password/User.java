package Encapsultation.Password;

public class User {
    private String password;  // This is hidden from other classes

    public User(String password) {
        this.password = password;
    }

    // Public method to safely check password
    public boolean checkPassword(String attempt) {
        return this.password.equals(attempt);
    }

    // Public method to change password (with rules)
    public void setPassword(String oldPassword, String newPassword) {
        if (checkPassword(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Incorrect old password.");
        }
    }
}

