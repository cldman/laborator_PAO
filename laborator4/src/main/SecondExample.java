package main;

import model.Notification;
import model.Receiver;

public class SecondExample {
    public static void main(String[] args) {
        Receiver receiver = new Receiver("Andrei", "no_adress");
        Notification myNotification = new Notification("hello world", receiver, "mars");

        System.out.println(myNotification);

        receiver.setName("Vlad");
        System.out.println(myNotification);
    }
}
