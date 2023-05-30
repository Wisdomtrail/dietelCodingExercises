package ArrayList;

import java.util.Arrays;

public class Bright {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{3, 4, 2, 1, 5})));
    }


    public static int[] sortArray(int[] array) {
      return Arrays.stream(array).sorted().toArray();
    }
}