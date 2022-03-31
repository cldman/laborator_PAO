package service;

import model.Account;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
        Collection Framework
                Set<T>
                implementari
                HashSet<T>
                LinkedHashSet<T>
                TreeSet<T>

 */
public class SetService {

    public static void main(String[] args) {
        Set<String> cities =  new HashSet<>();
        //does not maintain insertion order
        //does not contain duplicates, can contain one single null element tho
        cities.add("Bucuresti");
        cities.add("Cluj");
        cities.add("Arad");
        cities.add("Timisoara");
        cities.add("Bucuresti");
        cities.add(null);

        System.out.println("Unaltered set!");
        cities.forEach(System.out::println);


        Set<String> cities2 = new LinkedHashSet<>(); //maintains insertion order
        cities2.add("Bucuresti");
        cities2.add("Cluj");
        cities2.add("Arad");
        cities2.add("Timisoara");
        cities2.add("Bucuresti");
        cities2.add(null);

        System.out.println("Unaltered LinkedHashSet ordered by adding operation!");
        cities2.forEach(System.out::println);


        Set<Account> accounts = new TreeSet<>();
        accounts.add(new Account(10, "first"));
        accounts.add(new Account(5, "second"));
        accounts.add(new Account(15, "third"));

        System.out.println("Unaltered TreeSet accounts ordered by adding operation!");
        accounts.forEach(System.out::println);
            //create treeSet using custom comparator.
        /*Set<Account> accounts1 = new TreeSet<>(Comparator.comparing(Account::getAccountNumber));*/

        HashSet<Account> accounts2 = new HashSet<>();
        accounts2.add(new Account(10, "firstAccount"));
        accounts2.add(new Account(20, "secondAccount"));

        System.out.println("HashCode is always 1");
        accounts2.forEach(System.out::println);

    }

}
