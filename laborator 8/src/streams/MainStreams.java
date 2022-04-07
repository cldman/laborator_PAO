package streams;

import model.Ticket;
import model.TravelAgency;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainStreams {

    public static void main(String[] args) {
        List<Ticket> tickets = TravelAgency.getTickets();

        System.out.println("Number of tickets for Barcelona: " + getNumberOfTicketsForDestination(tickets, "Barcelona"));

        printTicketsForEmail(tickets, "andrei@gmail.com");

        System.out.println(existsTicketForEmail(tickets, "jhon@ymail.com"));

        System.out.println("Average ticket value is " + getTicketsAverageValue(tickets));

        System.out.println("Number of clients from Iasi " + getNumberOfTicketsForClientCity(tickets, "Iasi"));

        List<Ticket> ticketsOfClientsFromIasi = getTicketsForClientCity(tickets, "Iasi");
        for (Ticket ticket : ticketsOfClientsFromIasi) {
            System.out.println(ticket);
        }


        System.out.println("All clients have address set " + allTicketsClientsHaveAddress(tickets));
    }

    public static long getNumberOfTicketsForDestination(List<Ticket> tickets, String destination) {
        return tickets.stream()
                .filter(ticket -> Objects.nonNull(ticket.getDestination()))
                .filter(ticket -> ticket.getDestination().equals(destination))
                .count();
               /* tickets.stream()
                .filter(ticket -> Objects.nonNull(ticket.getDestination()) && ticket.getDestination().equals(destination))
                .count();*/
    }


    public static Predicate<Ticket> getTicketByEmailPredicate(String email) {
        return ticket -> ticket.getClient().getEmail().equals(email);
    }

    public static void printTicketsForEmail(List<Ticket> tickets, String email) {
        tickets.stream()
                .filter(ticket -> getTicketByEmailPredicate(email).test(ticket))
                .forEach(System.out::println);
    }

    public static boolean existsTicketForEmail(List<Ticket> tickets, String email) {
        return tickets.stream()
                .anyMatch(ticket -> getTicketByEmailPredicate(email).test(ticket));
    }

    public static double getTicketsAverageValue(List<Ticket> tickets) {
       /* return tickets.stream()
                .mapToDouble(ticket -> ticket.getPrice())
                .average()
                .getAsDouble();*/

        double sum = tickets.stream()
                .map(ticket -> ticket.getPrice())
                .reduce(0.0, (price1, price2) -> price1 +price2);

        return sum / tickets.size();

    }

    public static long getNumberOfTicketsForClientCity(List<Ticket> tickets, String city) {
        return tickets.stream()
                .filter(ticket -> ticket.getClient().getAddress() != null)
                .filter(ticket -> ticket.getClient().getAddress().contains(city))
                .count();
    }
    public static List<Ticket> getTicketsForClientCity(List<Ticket> tickets, String city) {
        return tickets.stream()
                .filter(ticket -> ticket.getClient().getAddress() != null)
                .filter(ticket -> ticket.getClient().getAddress().contains(city))
                .collect(Collectors.toList());
    }

    public static boolean allTicketsClientsHaveAddress(List<Ticket> tickets) {
        return tickets.stream()
                .allMatch(ticket -> ticket.getClient().getAddress() != null &&
                        !ticket.getClient().getAddress().isEmpty());
    }
}
