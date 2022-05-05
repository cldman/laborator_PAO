import java.util.Scanner;

public class ClientApp {

    public static void main(String[] args) {
        Client client = new Client();
        client.startConnection("127.0.0.1", 8081);

        Scanner scanner = new Scanner(System.in);
        String message;

        while(true) {
            System.out.println("message to send: ");
            message = scanner.nextLine();
            System.out.println("waiting for response...");
            String responseFromServer = client.sendMessage(message);
            System.out.println("server response: " + responseFromServer);
        }
    }
}
