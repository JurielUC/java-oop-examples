package ImportStatements.Net;

// Simple Server
import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");
        Socket socket = server.accept();
        System.out.println("Client connected.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        writer.println("Welcome to the chat!");
        String message = reader.readLine();
        System.out.println("Client says: " + message);

        socket.close();
        server.close();
    }
}
