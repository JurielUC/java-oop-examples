package ImportStatements.Net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class APIConnection {
    public static void main(String[] args) {
        try {
            // Step 1: Define API endpoint
            URI uri = URI.create("https://api.ais-batstateu.site/api/user/1");
            URL url = uri.toURL();

            // Step 2: Open connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET"); // R-Get, C-Post, U-Put, D-Delete - CRUD
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");

            // Step 3: Read response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();
            conn.disconnect();

            // Step 4: Print API response
            System.out.println("API Response: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
