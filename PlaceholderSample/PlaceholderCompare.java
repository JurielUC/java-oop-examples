package PlaceholderSample;
public class PlaceholderCompare {
    public static void main(String[] args) {
        String input = "2";
        int value = 2;

        String formattedValue = String.format("%d", value);
        
        if (input.equals(formattedValue)) {
            System.out.println("The string and the number are equal.");
        } else {
            System.out.println("The string and the number are NOT equal.");
        }
    }
}
