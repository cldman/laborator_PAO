package service;

import model.Client;

import java.util.List;
//singleton pattern
public class ClientService {
    //private final static ClientService INSTANCE = new ClientService(); //eager
    private static ClientService INSTANCE;


    private ClientService() {}

    public static ClientService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClientService();
        }
        return INSTANCE;
    }

    public List<Client> getClients() {
        return List.of(new Client("Alin", "first address", "alin@gmail.com"),
                new Client.Builder().email("email@gmail.com").address("bulevardul Timisoara nr3")
                                .name("Andrei").build(),
                new Client("Vasile", "second adress", "vasile.ymail.com"),
                new Client.Builder().name("Gheorghe").address("Vaslui").build(),
                new Client("Stefan", "Bucuresti", "stefan@Yahoo.com"));
    }
}
