package ImportStatements.IO;

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
import java.io.*;

/** Writing and reading a text file. */
public class Io {
    public static void main(String[] args) {
        try {
            // Write to file
            FileWriter writer = new FileWriter("./ImportStatements/IO/output.txt");
            writer.write("Hello, 2105. Test!");
            writer.close();

            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader("./ImportStatements/IO/test.txt"));
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
