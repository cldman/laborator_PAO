package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Collection Framework
    //List<T>
public class ListService {
    public static void main(String[] args) {
        //can contain duplicates and accepts multiple null values
        List<String> names = new ArrayList<>(); //keeps order of insertion
        names.add("Vasile");
        names.add("Vasile");
        names.add("Gheorge");
        names.add("Vasile");
        names.add(null);
        names.add("Ion");
        names.add(null);

        names.forEach(System.out::println);

        System.out.println("Name at position 3 is: " + names.get(2));

        names.remove(0);

        System.out.println("Name at position 3 is: " + names.get(2));

        names.clear();
        //names.isEmpty(); -> verify if list contains elements
        System.out.println("Lungimea listei: " + names.size());

        List<String> surnames = new ArrayList<>();
        surnames.add("Jhon");
        surnames.add("Jerry");

        names.addAll(surnames); // add entire collection to list
        System.out.println("Surnames after addAll");
        names.forEach(System.out::println);
        System.out.println("indexul la care se gaseste Jhon: " + names.indexOf("Jhon"));

        // return list with only one element
        //Utility  class for Collections
        //! Utility class for Strings -> StringUtils
        List<String> singleNameList = Collections.singletonList("Andrei");
       // singleNameList.add("Alex");

        //double linked list
        //recommended for insert/delete -> does not need reindexing after insert/delete
        LinkedList<String> firstNames = new LinkedList<>();
        firstNames.add("Vasile");
        firstNames.add("Vasile");
        firstNames.addFirst("Gheorge");
        firstNames.addLast("Vasile");
        firstNames.add(null);
        firstNames.add("Ion");
        firstNames.add(null);

        for (String firstName : firstNames) {
            System.out.println(firstName);
        }

        System.out.println("First surname is: " + firstNames.getFirst());
        System.out.println("Last surname is: " + firstNames.getLast());

    }

}
