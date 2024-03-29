package service;

import models.messaging.Notification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NotificationService {
    /*
      IO streams
      java.io
      IN
        low level
            InputStream
            FileInputStream
            ByteArrayInputStream
        high level              --> Decorator design pattern
            InputStreamReader
            BufferedReader
            ObjectInputStream
            DataInputStream
      OUT
        low level
            OutputStream
            FileOutputStream
            ByteArrayOutputStream
        high level              --> Decorator design pattern
            PrintStream
            PrintWriter
            ObjectOutputStream
            DataOutputStream
      File
     java.nio
        Files
        Path
        Paths
    */
    private static final String DIRECTORY_PATH = "resources/notifications";
    private static final String FILE_PATH = DIRECTORY_PATH + "/notifications.txt";
    //implement methods

    public void sendNotification(Notification notification) {
        //todo implement logic to send notifications all notifications will be written to file
        if(!Files.exists(Paths.get(DIRECTORY_PATH))) {
            try {
                Files.createDirectories(Paths.get(DIRECTORY_PATH));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        if(!Files.exists(Paths.get(FILE_PATH))) {
            try {
                Files.createFile(Paths.get(FILE_PATH));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_PATH),
                    StandardOpenOption.APPEND);
            writer.write("Notification <" + notification.getMessage() +
                    "> successfully sent to " + notification.getReceiver().getEmail() + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public void viewNotifications(String fileName) {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(fileName));
            String line = "";
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println("The file with the name " + fileName + " doesn't exist.");
        } catch (IOException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
    }




    public void createFolder(String folderName) throws IOException {
        Path path = Paths.get(folderName);
        Files.createDirectories(path);
    }

    public void createFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.createFile(path);
    }

    public void deleteFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.deleteIfExists(path);
    }

    public void listFolder(String folderName) throws IOException {
        Path path = Paths.get(folderName);
        Files.list(path).forEach(p -> System.out.println(p));
    }
}
