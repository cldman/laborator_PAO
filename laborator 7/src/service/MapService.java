package service;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
        Map<key, value> - interface

           concrete classes HashMap<K, V> -> does not maintain order of insertion/ cannot have duplicate values,
                            LinkedHashMap<K, V>  -> maintains insertion order
                            TreeMap<K, V>  -> entries are sorted based on key
 */
public class MapService {

    public static void main(String[] args) {
        Map<String, Integer> cities = new HashMap<>();
        cities.put("Bucuresti", 10);
        cities.put("Cluj", 20);
        cities.put("Arad", 40);
        cities.put("Timisoara", 10);
        cities.put("Bucuresti", 50);
        cities.put(null, 13);

        for (String city : cities.keySet()) {
            System.out.println(city + " number : " + cities.get(city));
        }


        Map<String, Integer> cities2 = new LinkedHashMap<>();
        cities2.put("Bucuresti", 10);
        cities2.put("Cluj", 20);
        cities2.put("Arad", 40);
        cities2.put("Timisoara", 10);
        cities2.put("Bucuresti", 50);
        cities2.put(null, 13);
        System.out.println("LinkedHashMap ordered by insertion");
        for (String city2 : cities2.keySet()) {
            System.out.println(city2 + " number : " + cities2.get(city2));
        }

        if(cities.containsKey("Timisoara")) {
            System.out.println("Cities contains " + cities.get("Timisoara"));
        }

        cities.forEach((key, value) -> System.out.println("City " + key + " has number: " + value));
    }

}
