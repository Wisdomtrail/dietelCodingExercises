package chapterSixteen;

import java.util.Map;
import java.util.TreeMap;

public class MapSample2 {
    public static void main(String[] args) {

        Map<String, Integer> people = new TreeMap<>();
        people.put("ahmed", 20);
        people.put("sunday", 89);
        people.put("prof", 67);

        System.out.println(people);
    }
}
