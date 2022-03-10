package main;

import model.Notification;
import model.Receiver;

public class FirstExample {

    public static void main(String[] args) {
        Receiver receiver = new Receiver("Andrei", "no_adress");
        Notification myNotification = new Notification("hello world", receiver, "mars");

        //    PushNotification myPushNotification =  new PushNotification("hey from Pluto","terra", "pluto", "1234");

        String name = null;
        String name1 = new String("GIGI");

        System.out.println(name == name1);

        //nu apelati nullable.equals(notNullable) -> NullPointerException
        if("GIGI".equals(name1)) {
            System.out.println("cuvintele au aceeasi valoare");
        }
        name1 = "GIGI";

        System.out.println(name == name1);

        String message = "hellooooooooooooo";
        message += " world1";
        message += " from1";
        message += " mars";

        System.out.println(message);

        StringBuilder messageBuiler = new StringBuilder("hello");
        messageBuiler.append(" world");
        messageBuiler.append(" from");
        messageBuiler.append(" mars");

        System.out.println(messageBuiler.toString());

        String[] words = message.split(" ");

        for(String word : words) {
            System.out.println("All words");
            System.out.println(word);
            if(word.length() == 4) {
                System.out.println("Words with length equal to 4");
                System.out.println(word);
            }

            if(word.matches("^[a-z]{3,10}")) {
                System.out.println("Words that contain only chars");
                System.out.println(word);
            }
        }


        String mySecondMessage =  messageBuiler.toString();
        System.out.println(mySecondMessage.replace("mars", "pluto"));

        String user = "andrei-ion91";
        if(user.matches("^[a-z0-9_-]{3,18}$")){
            System.out.println("user matches patter");
        } else {
            System.out.println("user does not match pattern");
        }


    }
}
