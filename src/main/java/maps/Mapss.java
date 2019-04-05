package maps;

import java.util.HashMap;
import java.util.Map;

public class Mapss {
    public static void main(String[] args) {

        Map<Integer, String> grades = new HashMap<>();

        grades.put(78, "Shelly White");
        grades.put(64, "Harry Bould");
        grades.put(100, "Chatyra Cephas");

        System.out.println(grades.get(64));

        for(Integer keys: grades.keySet()){
            System.out.println(grades.get(keys));
        }

        Map<Integer, Student> people = new HashMap<>();

        people.put(1, new Student("Taylor", 23));
        people.put(2, new Student("T'Shay", 23));
        people.put(3, new Student("French Vanilla", 24));

        for(Map.Entry i : people.entrySet()){
            System.out.println( " " + i.getKey() + " : " + i.getValue());
        }
        System.out.println(((HashMap<Integer, Student>) people).clone());
        System.out.println(people.size());




    }
}
