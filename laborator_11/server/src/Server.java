import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;


    public void startServer(int port) {
        try{
            System.out.println("starting server!");
            serverSocket = new ServerSocket(port);
            clientSocket = serverSocket.accept();
            printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
            bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            Scanner scanner = new Scanner(System.in);
            String messageFromClient;

            while(true) {
                messageFromClient = bufferedReader.readLine();
                System.out.println("client says: " + messageFromClient);
                if("bye".equals(messageFromClient)) {
                    printWriter.println("client has exited, server is closing...");
                    break;
                }
                System.out.println("response message: ");
                printWriter.println(scanner.nextLine());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
