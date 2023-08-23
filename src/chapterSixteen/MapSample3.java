package chapterSixteen;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MapSample3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(98);
        list.add(12);
        list.add(32);
        System.out.println("normal list "+list);
        Collections.sort(list);
        System.out.println("sorted list "+list);
        Collections.shuffle(list);
        System.out.println("shuffled list "+list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }
}
