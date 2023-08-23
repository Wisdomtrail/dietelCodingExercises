package chapterSixteen;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSample5 {
    public static void main(String[] args) {
        List<String> words = List.of(
                "AAA",
                "BBB",
                "QWERTY",
                "CCC"
        );

        List<String> list1 = words.stream()
                .flatMap(s -> Stream.of(s.split(""))).toList();


        System.out.println(list1);
    }
}
