package model;

import java.util.Arrays;
import java.util.List;

public class TravelAgency {


    public static List<Ticket> getTickets(){
        List<Client> clients = getClients();
        return Arrays.asList(
                new Ticket("Bucuresti","Madrid",clients.get(0) ,500),
                new Ticket("Bucuresti", "Barcelona", clients.get(1), 350),
                new Ticket("Bucuresti", "Paris", clients.get(2), 270),
                new Ticket("Bucuresti", "Londra", clients.get(3), 410),
                new Ticket("Bucuresti", "Oslo", clients.get(4), 390),
                new Ticket("Bucuresti", "Dublin", clients.get(5), 360),
                new Ticket("Bucuresti", "Berlin", clients.get(6), 620),
                new Ticket("Bucuresti", "Barcelona", clients.get(7), 410)


        );
    }

    public static List<Client> getClients() {
        return Arrays.asList(
                new Client("Andrei", "Str. Dezrobirii nr.20, Bucuresti", "andrei@gmail.com"),
                new Client("Ion", "Blv. Unirii nr.10, Timisoara", "ion@gmail.com"),
                new Client("Gheorge", "Str. Libertatii nr.15, Brasov", "gheorge@gmail.com"),
                new Client("Razvan", "Blv. Camil Ressu nr.2, Bucuresti", "razvan@gmail.com"),
                new Client("Alin", "Str. Campiei nr.18, Bucuresti", "andrei@gmail.com"),
                new Client("Cosmin", "Str. Viei nr.20, Iasi", "andrei@gmail.com"),
                new Client("Bianca", "Str. Lalelelor nr.17, Iasi", "andrei@gmail.com"),
                new Client("Iulia", "Str. Trandafirilor nr.20, Bucuresti", "andrei@gmail.com")
        );
    }
}
