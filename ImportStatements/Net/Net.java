package ImportStatements.Net;

import java.net.*;  
import java.io.*;

public class Net {
    public static void main(String[] args) {
        try {
            URI uri = URI.create("https://www.wikipedia.org");
            URL url = uri.toURL();

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0"); // Pretend to be a browser

            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                int count = 0;
                while ((line = br.readLine()) != null && count < 10) { 
                    System.out.println(line); // Print first 10 lines only
                    count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
