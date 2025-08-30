package CharactersSample;

class CharacterTest {
    public static void main(String[] args) {
        char letter = 'a', digit = '0';

        letter = 65;  // A
        digit = 53;   // 5

        System.out.println("letter is: " + letter);
        System.out.println("digit is: " + digit);

        // letter = letter + 'Z'; // Compile error

        letter = (char)(letter + 'Z');

        System.out.println("letter is: " + letter);
    }
}



