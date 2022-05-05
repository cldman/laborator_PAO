import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private Socket clientSocket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;

    public void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
            bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public String sendMessage(String message) {
        printWriter.println(message);
        String response = null;
        try {
            response = bufferedReader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return response;
    }
}
